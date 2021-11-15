import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF2 {
	
	public static WebDriver driver;
	public static String Vtitle, vfilepath;
	public static String Vsearch , VURL;
	public static int xlRows,xlCols;
	public static String xData[][];

	public static void main(String[] args) throws Exception {
		
		Vsearch= "Samsung S21 Ultra";
		VURL= "https://www.amazon.com";
		xlRead("C:\\Users\\00004725\\AmazonDataFrameworks.xls");
		for (int i=1;i<xlRows;i++)
		{
		if(xData[i][1].equalsIgnoreCase("Y"))
		{
			
		Vsearch=xData[i][2];
			
		System.out.println(TS001());
		System.out.println(TS002(Vsearch));
		System.out.println(TS003());
		xData[i][4]=Vtitle;
		if(Vtitle.contains(xData[i][3]))
		{
			xData[i][5]="PASS";
			takesnapshot(xData[i][0]);
			
		}
		else
		{
			xData[i][5]="FAIL";
			takesnapshot(xData[i][0]);
		}
		xData[i][6]=vfilepath;
		System.out.println(TS004());
		}
		}
		xlwrite("C:\\Users\\00004725\\test data excel for write method\\AmazonDDFResults.xls", xData);
		
	}
	
	public static String TS001() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004725\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(VURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		return "TS001-PASS";
	}
	public static String TS002(String Vsearch) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Vsearch);
		driver.findElement(By.id("nav-search-submit-button")).click();
		return "TS002-PASS";
	}

	public static String TS003() {
		Vtitle= driver.getTitle();
		System.out.println(Vtitle);
		return "TS003-PASS";
	}
	public static String TS004() {
		driver.close();
		return "TS004-PASS";
	}
	public static void xlRead(String sPath) throws Exception
	{
		File myFile=new File(sPath);
		FileInputStream myStream=new FileInputStream(myFile);
		HSSFWorkbook myworkbook=new HSSFWorkbook(myStream);
		HSSFSheet mySheet=myworkbook.getSheetAt(0);
		xlRows=mySheet.getLastRowNum()+1;
		xlCols=mySheet.getRow(0).getLastCellNum();
		System.out.println("Row Number is "+xlRows);
		System.out.println("Col Number is "+xlCols);
		xData=new String[xlRows][xlCols];
		for(int i=0;i<xlRows;i++)
		{
			HSSFRow row=mySheet.getRow(i);
			for(short j=0;j<xlCols;j++)
			{
				HSSFCell cell=row.getCell(j);
				String value=cellToString(cell);
				xData[i][j]=value;
				System.out.print("-"+xData[i][j]);
			}
			System.out.println();
		}
	}
		@SuppressWarnings("deprecation")
		public static String cellToString(HSSFCell cell)
		{
			int type=cell.getCellType();
			Object result;
			switch(type)
			{
			case HSSFCell.CELL_TYPE_NUMERIC:
			result=cell.getNumericCellValue();
			break;
			case HSSFCell.CELL_TYPE_STRING:
			result=cell.getStringCellValue();
			break;
			case HSSFCell.CELL_TYPE_FORMULA:
			throw new RuntimeException("We cannot evaluate formula");
			case HSSFCell.CELL_TYPE_BLANK:
			result="-";
			case HSSFCell.CELL_TYPE_BOOLEAN:
			result=cell.getBooleanCellValue();
			case HSSFCell.CELL_TYPE_ERROR:
			result="This cell has some error";
			default:
			throw new RuntimeException("We do not support this cell type");
			}
			return result.toString();
			
		}

		public static void xlwrite(String xlpath1,String[][] xData) throws Exception
		{
			System.out.println("Inside XL Write");
			File myFile1=new File(xlpath1);
			FileOutputStream fout=new FileOutputStream(myFile1);
			HSSFWorkbook wb=new HSSFWorkbook();
			HSSFSheet mySheet1=wb.createSheet("TestResults");
			for(int i=0;i<xlRows;i++)
			{
				HSSFRow row1=mySheet1.createRow(i);
				for(short j=0;j<xlCols;j++)
				{
					HSSFCell cell1=row1.createCell(j);
					cell1.setCellType(HSSFCell.CELL_TYPE_STRING);
					cell1.setCellValue(xData[i][j]);
				}
			}
			wb.write(fout);
			fout.flush();
			fout.close();
		}

		public static void takesnapshot(String vString) throws IOException
		{
			TakesScreenshot ts = ((TakesScreenshot)driver);
		    File source= ts.getScreenshotAs(OutputType.FILE);	
			File DestFile = new File ("C:\\Users\\00004725\\test data excel for write method\\screenshot" + vString+ ".png");
		    FileUtils.copyFile(source,DestFile);
		    vfilepath = DestFile.getPath();
		    System.out.println("File Path :" + vfilepath);
		}

	
}
