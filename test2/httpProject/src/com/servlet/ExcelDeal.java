package com.servlet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDeal {
    public static void main(String[] args) {
       //  String arr[] = {"aaa", "xxx"};
        String arr[] = {"iPad Pro 12.9ʺ Ascend Keyboard Case Lite","HaloLock™ mini Wireless Charger","iPad 10th Generation Rebound Magnetic Keyboard Case","Kickstand Portable Monitor","AirPods Pro (2022) Orbit Hybrid Case with HaloLock","iPhone 14 Pro Max Snap-and-Stand Charging Bundle","iPhone 14 Pro Snap-and-Stand Charging Bundle","iPhone 14 Plus Snap-and-Stand Charging Bundle","iPhone 14/13 Snap-and-Stand Charging Bundle","Support Ring HaloLock™","HaloLock™ Ring Stand","HaloLock™ Mini Power Bank Wireless 5,000 mAh","HaloLock™ 10,000mAh Kickstand Wireless Power Bank","HaloLock™ with CryoBoost™ Pro Bundle","iPad 10th Generation Classic Hybrid Bundle","Pack Híbrido Ascend para iPad 10ª generación","Kit protettivo Ibrido serie Ascend per iPad 10a Generazione","Pack Hybrid Ascend pour iPad 10e Génération","iPad 10. Generation Ascend Hybrid Bundle","iPad 第10世代インチ Ascend Hybridセット","iPad Pro 12,9\" (2022/2021) Ascend Hybrid Bundle","iPad Pro 12.9\" (2022/2021) Ascend Hybrid Bundle","iPad Pro 11\" (2022/2021) Ascend Hybrid Bundle","iPad 10th Generation Ascend Hybrid Bundle","iPad Pro 11\" (2022/2021/2020) Art Bundle","iPad Pro 12.9\" (2022/2021/2020) Art Bundle","iPad 10th Generation Art Bundle","iPad Pro 12.9\"/11\" Tempered-Glass Camera Lens Protector","Protector de pantalla magnético Efecto Papel para iPad de 10ª generación","Protezione per lo Schermo Magnetica Sensazione Foglio per iPad 10a Generazione","Protecteur D'écran Magnétique Sensation Papier pour iPad 10e Génération","iPad 10. Generation Paper Feel Magnetische Displayschutzfolie","iPad 10 ペーパー感覚の磁気保護フィルム","iPad Pro 11\" and Air 5/4 Paper-Feel Magnetic Screen Protector","iPad Pro 12.9\" Paper-Feel Magnetic Screen Protector","iPad 10th Generation Paper-Feel Magnetic Screen Protector","iPad 10th Generation Paper-Feel Screen Protector","iPad 10th Generation Tempered-Glass Screen Protector","iPad Pro 11\" (2022/2021) Project Zero Soft Case","iPad Pro 12.9” (2022/2021) Classic Hybrid Case","iPad 10th Generation Classic Hybrid Case","iPad Pro 12.9\" (2022/2021) Ascend Trifold Case","iPad Pro 11\" (2022/2021) Ascend Trifold Case","iPad 10th Generation Ascend Trifold Case","iPad Pro 12.9\" (2022/2021) Ascend Hybrid Case","iPad Pro 11\" (2022/2021) Ascend Hybrid Case","iPad 10th Generation Ascend Hybrid Case","iPad Pro 11\" (2022/2021) Rebound Pencil Case","iPad 10th Generation Rebound Pencil Case","iPad Pro 11\" (2022/2021) Rebound Hybrid Case 360","iPad Pro 12.9\" (2022/2021) Rebound Hybrid Case 360","iPad 10th Generation Rebound Magnetic Case","AirPods Pro (2022/2019) Bounce Carrying Case","AirPods Pro (2022/2019) Cyber Armor Tough Case with HaloLock","iPhone 14 Pro Max Place-and-Go Charging Bundle","iPhone 14 Pro Place-and-Go Charging Bundle","iPhone 14 Plus Place-and-Go Charging Bundle","iPhone 14/13 Place-and-Go Charging Bundle","iPhone 14 Pro Max Classic Hybrid Protection Bundle","iPhone 14 Pro Classic Hybrid Protection Bundle","iPhone 14 Plus Classic Hybrid Protection Bundle","iPhone 14/iPhone 13 Classic Hybrid Protection Bundle","iPhone 14 Pro Max Home Theater Bundle","iPhone 14 Pro Home Theater Bundle","iPhone 14 Plus Home Theater Bundle","iPhone 14/iPhone 13 Home Theater Bundle","iPhone 14 Pro/14 Pro Max Tempered-Glass Lens Protectors","iPhone 14/14 Plus Tempered-Glass Lens Protectors","iPhone 14 Pro Max Tempered-Glass Privacy Screen Protector","iPhone 14 Pro Tempered-Glass Privacy Screen Protector","iPhone 14 Plus/iPhone 13 Pro Max Tempered-Glass Privacy Screen Protector","iPhone 14/13/13 Pro Tempered-Glass Privacy Screen Protector","iPhone 14 Pro Max Tempered-Glass Screen Protector","iPhone 14 Pro Tempered-Glass Screen Protector","iPhone 14 Pro Max Armorite™ Screen Protector","iPhone 14 Pro Armorite™ Screen Protector","iPhone 14 Plus Krystec™ Clear Case with HaloLock","iPhone 14 Pro Krystec™ Clear Case with HaloLock","iPhone 14 Pro Max Classic Kickstand Case with HaloLock","iPhone 14 Pro Classic Kickstand Case with HaloLock","iPhone 14 Pro Max Classic Hybrid Case with HaloLock","iPhone 14 Pro Classic Hybrid Case with HaloLock","iPhone 14 Pro Max Air Armor Clear Case with HaloLock","iPhone 14 Pro Air Armor Clear Case with HaloLock","iPhone 14 Pro Krystec™ Clear Case","iPhone 14 Pro Max Krystec™ Clear Case","iPhone 14 Pro Max Classic Kickstand Case","iPhone 14 Pro Classic Kickstand Case","iPhone 14 Pro Max Air Armor Clear Case","iPhone 14 Pro Air Armor Clear Case","iPhone 14 Pro Max Metal Kickstand Case","iPhone 14 Pro Metal Kickstand Case","iPhone 14 Pro Max Project Zero Clear Case","iPhone 14 Pro Project Zero Clear Case","iPhone 14 Krystec™ Clear Case with HaloLock","iPhone 14 Plus Krystec™ Clear Case","iPhone 14 Krystec™ Clear Case","iPhone 14 Plus Classic Kickstand Case with HaloLock","iPhone 14/13 Classic Kickstand Case with HaloLock","iPhone 14 Plus Classic Kickstand Case","iPhone 14/13 Classic Kickstand Case","HaloLock™ Magnetic Car Phone Mount","HaloLock™ Universal Ring 360","HaloLock™ 5,000 mAh mini Kickstand Wireless Power Bank","HaloLock™ Banque de Puissance sans Fil de 10000","HaloLock™ Kabellos 10.000 mAh Powerbank","ESR Armband Phone Holder and Hydration Waist Pack","ESR Armband Phone Holder","iPhone 14 Plus Classic Hybrid Case with HaloLock","iPhone 14 Plus Air Armor Clear Case with HaloLock","iPhone 14 Plus Air Armor Clear Case","iPhone 14 Plus Metal Kickstand Case","iPhone 14 Plus Project Zero Clear Case","HaloLock™ Power Bank Wireless 10,000mAh","iPhone 14 Pro Max Krystec™ Clear Case with HaloLock","HaloLock™ 3-in-1 Wireless Charger with CryoBoost™","iPad Air 5/4 Art Bundle","iPad Air 5/4 and Pro 11” Rebound Hybrid Protection Bundle","Apple Watch Series 8/7/6/5/4/SE Shock Armor Protective Band","iPad Air 5/4 and Pro 11” Ascend Keyboard Case","iPad Pro 12.9\" Rebound Magnetic Keyboard Case","iPad Air 5/4 and Pro 11” Rebound Magnetic Keyboard Case","HaloLock™ Vegan Leather Wallet Stand","HaloLock™ Shift Wireless Car Charger","iPhone 13 Pro Place-and-Go Charging Bundle","iPhone 13 Place-and-Go Charging Bundle","iPhone 13 Pro Max Place-and-Go Charging Bundle","iPad mini 6 (2021) Paper-Feel Screen Protector","AirPods 3 (2021) Daydream Style Case","iPhone 13/13 Pro Armorite X Ultra-Tough Tempered-Glass Screen Protector","iPhone 13 Pro Max Air Armor 360 Protection Bundle","iPhone 13 Pro Air Armor 360 Protection Bundle","iPhone 13 Air Armor 360 Protection Bundle","iPhone 13 Pro Max Air Armor Clear Case","iPhone 13 Pro Air Armor Clear Case","iPhone 14/13 Air Armor Clear Case","iPhone 12/12 Pro Pop! Style Case","test66","iPhone 12 Pro Max Metro Vegan Leather Case with MagSafe","iPhone 12/12 Pro Metro Vegan Leather Case with MagSafe","Cloud Silicone AirTag 2021 Keychain Case","Metro Leather AirTag 2021 Keychain Case (2-Pack)","Cloud Silicone AirTag 2021 Keychain Case (2-Pack)","Metro Leather AirTag 2021 Keychain Case","HaloLock™ Universal Ring","A+","iPhone 12/12 Pro Sidekick Hybrid Case with HaloLock","iPhone 12 Pro Max Sidekick Hybrid Case with HaloLock","iPad Pro 11\" (2022/2021/2020) Rebound Magnetic Case","iPad Pro 12.9\" (2022/2021/2020) Rebound Magnetic Case","iPad Pro 11(2021/2020/2018) Tempered-Glass Screen Protector","iPad Pro 12.9” Tempered-Glass Screen Protector","iPad Pro 11 (2021/2020/2018) Paper-Feel Screen Protector","iPad Pro 12.9\" Paper-Feel Screen Protector","iPad Pro 12.9\" (2022/2021) Rebound Pencil Case","iPad Pro 12.9 2021 Sentry Protective Case with Stand","iPhone 12 Cloud Soft Case with MagSafe","iPhone 12 Pro Max Cloud Soft Case with MagSafe","iPhone 12 mini Cloud Soft Case with MagSafe","iPhone 12 Pro Cloud Soft Case with MagSafe","HaloLock™ Kickstand MagSafe Compatible Wireless Charger","iPhone 12 Pro Max HD Clear Tempered-Glass Camera Lens Protector","iPhone 12 Pro HD Clear Tempered-Glass Camera Lens Protector","iPhone 12 HD Clear Tempered-Glass Camera Lens Protector","iPhone 12 mini HD Clear Tempered-Glass Camera Lens Protector","iPhone 12/12 Pro Armorite™ Ultra-Tough Tempered-Glass Screen Protector","iPhone 12 Pro Max Armorite™ Ultra-Tough Tempered-Glass Screen Protector","iPhone 12 mini Armorite™ Ultra-Tough Tempered-Glass Screen Protector","HaloLock™ Dashboard Wireless Car Charger","Digital iPad Stylus Pencil with Magnetic Attachment","HaloLock™ Magnetic Wireless Car Charger","iPhone 12 Pro Max Tempered Glass Privacy Screen Protector","iPhone 12/12 Pro Tempered Glass Privacy Screen Protector","iPhone 12 mini Tempered Glass Privacy Screen Protector","iPad Air 5/4 Ascend Protection Bundle","iPhone 12 Pro Max Project Zero Slim Clear Case","iPhone 12/12 Pro Project Zero Slim Clear Case","iPhone 12 mini Project Zero Slim Clear Case","iPhone 12 Pro Max Tempered-Glass Full-Coverage Screen Protector","iPhone 12/12 Pro Tempered-Glass Full-Coverage Screen Protector","iPhone 12 mini Tempered-Glass Full-Coverage Screen Protector","iPhone 12 Pro Max Metal Kickstand Case","iPhone 12/12 Pro Metal Kickstand Case","iPhone 12 mini Metal Kickstand Case","ESR Apple Pencil Holder"};
        List<String> list = Arrays.asList(arr);

        List<String> title_list = new ArrayList<>();

        try (Workbook workbook = new XSSFWorkbook(new FileInputStream("E:\\www\\product\\a\\product-import-template.xlsx"))) {
            // 获取工作簿
            Sheet sheet = workbook.getSheetAt(0);
            int product_i = 0;
            for(int i = 0 ; i <= sheet.getLastRowNum();i++) {
                Row row = sheet.getRow(i);

                if(i == 0) {
                    int cols = row.getLastCellNum();
                    for (int k = 0; k < cols; k++) {
                        Cell cell_t = row.getCell(k);
                        if(cell_t == null){
                            continue;
                        }
                        String str = "product_title";
                        String str2 = cell_t.getStringCellValue();
                        title_list.add(str2);
                        if(str2.equals(str)){
                            product_i = k;
                        }
                    }
                    continue;
                }
                if(row != null){
                    Cell product = row.getCell(product_i);
                    if(product != null){
                        String title = product.getStringCellValue();
                        // System.out.println("product_title：" + product.getStringCellValue());
                        if(list.contains(title)){
                            System.out.println("product_title in ：" + title);

                        }
                    }
                }


                // 按照下标获取当前行的单元格
                /*
                Cell cell0 = row.getCell(0); // UUID
                Cell cell1 = row.getCell(1); // Math
                Cell cell2 = row.getCell(2); // 日期

              //  System.out.println("UUID值：" + cell0.getStringCellValue());
              //  System.out.println("Math随机值：" + cell1.getNumericCellValue());
              //  System.out.println("当前时间：" + cell2.getNumericCellValue());
                System.out.println("Math随机值：" + cell0.getStringCellValue());
              //   System.out.println("当前时间：" + cell2.getStringCellValue());
              */
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(title_list);
    }

    public static void createExcel(String filename){
        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream out = new FileOutputStream("E:\\product\\out\\" + filename)) {

            // 创建工作簿sheet
            Sheet sheet0 = workbook.createSheet("sheet1");

            //创建数据行Row
            Row row0 = sheet0.createRow(0);
            Row row = sheet0.createRow(1);

            // 创建单元格
            Cell cell00 = row0.createCell(0);
            cell00.setCellValue("UUID值");

            Cell cell0 = row.createCell(0);
            cell0.setCellValue(UUID.randomUUID().toString());


            Cell cell01 = row0.createCell(1);
            cell01.setCellValue("Math随机值");

            Cell cell1 = row.createCell(1);
            cell1.setCellValue(Math.random()*1000);


            Cell cell02 = row0.createCell(2);
            cell02.setCellValue("当前时间");

            Cell cell2 = row.createCell(2);
            cell2.setCellValue(LocalDateTime.now());

            // 将Workbook对象中包含的数据，通过输出流，写入至Excel文件
            workbook.write(out);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
