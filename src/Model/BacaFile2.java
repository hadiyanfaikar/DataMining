
package Model;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class BacaFile2 {

    public static String BacaFile2(String dataFile) {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(new File(dataFile)));
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            HSSFRow row = sheet.getRow(1);
            String str = row.getCell(0).getRichStringCellValue().getString();
            return str;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
