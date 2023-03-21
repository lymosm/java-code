package pattern;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;

public class PatternObj {

    public static List <String> dt_title_list = new ArrayList();
    public static List <String> dt_cont_list = new ArrayList<String>();
    public static List <String> dt_icon_list = new ArrayList<String>();
    public static List <String> dt_icon_img_list = new ArrayList<String>();

    public static void main(String args[]){
        System.out.println("start");
        String str = "J<a href=>ure 世界 的健康度<a hdur></a> sss" +
                "dkkkdl  <a href=''>ssdas</a>ddd";
        String str2 = "[ux_banner label=\"pc-top\" visibility=\"hide-for-small\" height=\"448px\" class=\"uc-top\"]\n" +
                "\n" +
                "            [text_box width=\"100\" position_x=\"50\" position_y=\"50\"]\n" +
                "            \n" +
                "            <div class=\"uc-dt-box\">\n" +
                "            <div class=\"uc-dt-item uc-dt-left\"><h3><p class=\"uc-dt-title\">Compatibility</p></h3><p class=\"uc-dt-cont\">Only for iPhone 12</p><h3><p class=\"uc-dt-title\">Silky Smooth</p></h3><p class=\"uc-dt-cont\">Soft and grippy silicone feels great in your hand</p><h3><p class=\"uc-dt-title\">Made For MagSafe</p></h3><p class=\"uc-dt-cont\">Apple certified to work with all MagSafe and HaloLock accessories</p><h3><p class=\"uc-dt-title\">Premium Protection</p></h3><p class=\"uc-dt-cont\">Soft lining protects against scratches while raised edges and the Camera Guard Pro lens frame protect your screen and camera</p></div><div class=\"uc-dt-item uc-dt-right\">\n" +
                "            <div class=\"uc-dt-icon-item\">\n" +
                "                <div class=\"uc-dt-icon\">\n" +
                "                    <div class=\"uc-dt-img uc-dt-img1\"></div><h4><p class=\"uc-dt-icon-txt\">Easy-Press Buttons</p></h4> \n" +
                "                    </div>\n" +
                "                    <div class=\"uc-dt-icon\"><div class=\"uc-dt-img uc-dt-img2\"></div><h4><p class=\"uc-dt-icon-txt\">Microfiber Lining</p></h4></div></div><div class=\"uc-dt-icon-item\">\n" +
                "                <div class=\"uc-dt-icon\">\n" +
                "                <div class=\"uc-dt-img uc-dt-img3\"></div><h4><p class=\"uc-dt-icon-txt\">Precise Cutouts</p></h4></div><div class=\"uc-dt-icon\">\n" +
                "                <div class=\"uc-dt-img uc-dt-img4\"></div><h4><p class=\"uc-dt-icon-txt\">Smooth Silky Feel</p></h4></div></div></div>\n" +
                "    </div>\n" +
                "    \n" +
                "    [/text_box]\n" +
                "    \n" +
                "    [/ux_banner][ux_banner label=\"m-top\" visibility=\"show-for-small\" height=\"448px\" height__sm=\"84vh\" class=\"uc-top\"]\n" +
                "\n" +
                "            [text_box width=\"100\" position_x=\"50\" position_y=\"50\"]\n" +
                "            \n" +
                "            <div class=\"uc-dt-box\">\n" +
                "            <div class=\"uc-dt-item uc-dt-left\"><h3><p class=\"uc-dt-title\">Compatibility</p></h3><p class=\"uc-dt-cont\">Only for iPhone 12</p><h3><p class=\"uc-dt-title\">Silky Smooth</p></h3><p class=\"uc-dt-cont\">Soft and grippy silicone feels great in your hand</p><h3><p class=\"uc-dt-title\">Made For MagSafe</p></h3><p class=\"uc-dt-cont\">Apple certified to work with all MagSafe and HaloLock accessories</p><h3><p class=\"uc-dt-title\">Premium Protection</p></h3><p class=\"uc-dt-cont\">Soft lining protects against scratches while raised edges and the Camera Guard Pro lens frame protect your screen and camera</p></div><div class=\"uc-dt-item uc-dt-right\">\n" +
                "            <div class=\"uc-dt-icon-item\">\n" +
                "                <div class=\"uc-dt-icon\">\n" +
                "                    <div class=\"uc-dt-img uc-dt-img1\"></div><h4><p class=\"uc-dt-icon-txt\">Easy-Press Buttons</p></h4>\n" +
                "                    </div>\n" +
                "                    <div class=\"uc-dt-icon\"><div class=\"uc-dt-img uc-dt-img2\"></div><h4><p class=\"uc-dt-icon-txt\">Microfiber Lining</p></h4></div></div><div class=\"uc-dt-icon-item\">\n" +
                "                <div class=\"uc-dt-icon\">\n" +
                "                <div class=\"uc-dt-img uc-dt-img3\"></div><h4><p class=\"uc-dt-icon-txt\">Precise Cutouts</p></h4></div><div class=\"uc-dt-icon\">\n" +
                "                <div class=\"uc-dt-img uc-dt-img4\"></div><h4><p class=\"uc-dt-icon-txt\">Smooth Silky Feel</p></h4></div></div></div>\n" +
                "    </div>\n" +
                "    \n" +
                "    [/text_box]\n" +
                "    \n" +
                "    [/ux_banner][ux_banner visibility=\"hide-for-small\" height=\"56%\" bg=\"320799\" bg_size=\"original\"][/ux_banner][ux_banner label=\"m\" visibility=\"show-for-small\" height=\"41%\" height__sm=\"70%\" bg=\"320801\" bg_size=\"original\"][/ux_banner][ux_banner class=\"uc-img-txt\" height=\"14%\" bg_color=\"rgb(255, 255, 255)\"][text_box position_x=\"50\" position_y=\"50\" width=\"100%\"]\n" +
                "            <h2 class=\"uppercase\"><strong class=\"uc-txt-title\">More Bang for Your Buck</strong></h2><p class=\"uc-txt-detail\">Everything you love about the Apple silicone case and more. With better camera protection, MagSafe compatibility, and plenty of brilliant colors to choose from the Cloud Soft Case is a superior case that still respects your wallet.</p>\n" +
                "            [/text_box]  \n" +
                "            [/ux_banner][ux_banner class=\"uc-mo3 mo3-img\" height=\"30%\" bg=\"320806\" bg_size=\"original\"]\n" +
                "            [/ux_banner][ux_banner class=\"uc-mo3\" height=\"30%\"]\n" +
                "\n" +
                "            [text_box text_color=\"dark\" width=\"100%\" position_x=\"50\" position_y=\"50\"]\n" +
                "            \n" +
                "            <h2 class=\"uppercase\"><strong class=\"uc-txt-title\">Silky-Smooth Silicone </strong></h2><p class=\"uc-txt-detail\">Fall in love with the feeling of liquid silicone in your hand. The soft-to-the-touch exterior provides stellar grip while keeping the buttons easy to press.</p>\n" +
                "            [/text_box]   \n" +
                "            [/ux_banner][ux_banner class=\"uc-mo4 uc-float-right mo4-img\" height=\"30%\" bg=\"320810\" bg_size=\"original\"]\n" +
                "            [/ux_banner][ux_banner class=\"uc-mo4\" height=\"30%\"]\n" +
                "\n" +
                "            [text_box text_color=\"dark\" width=\"100%\" position_x=\"50\" position_y=\"50\"]\n" +
                "            \n" +
                "            <h2 class=\"uppercase\"><strong class=\"uc-txt-title\">Hybrid Protection</strong></h2><p class=\"uc-txt-detail\">The 3-layer design provides comprehensive protection. Protect your iPhone from the perils of daily life with a sturdy polycarbonate core, shock-absorbing silicone exterior, and microfiber lining.</p>\n" +
                "            [/text_box]   \n" +
                "            [/ux_banner][ux_banner visibility=\"hide-for-small\" height=\"56%\" bg=\"320823\" bg_size=\"original\"][/ux_banner][ux_banner label=\"m\" visibility=\"show-for-small\" height=\"41%\" height__sm=\"70%\" bg=\"320827\" bg_size=\"original\"][/ux_banner][ux_banner class=\"uc-img-txt\" height=\"14%\" bg_color=\"rgb(255, 255, 255)\"][text_box position_x=\"50\" position_y=\"50\" width=\"100%\"]\n" +
                "            <h2 class=\"uppercase\"><strong class=\"uc-txt-title\">A Color for any Occasion</strong></h2><p class=\"uc-txt-detail\">Plenty of colorful options help your iPhone look great wherever you are. Go classic black for a timeless look or mix it up with a stunning pink. A plethora of great choices make this the perfect case for both men and women.</p>\n" +
                "            [/text_box]  \n" +
                "            [/ux_banner]<p><style>.uc-dt-img1{ background-image: url(https://static.esrgear.com/wp-content/uploads/2021/08/Easy-Press-Buttons-5.jpg); }.uc-dt-img2{ background-image: url(https://static.esrgear.com/wp-content/uploads/2021/08/Microfiber-Lining-1-1.jpg); }.uc-dt-img3{ background-image: url(https://static.esrgear.com/wp-content/uploads/2021/08/Precise-Cutouts-6.jpg); }.uc-dt-img4{ background-image: url(https://static.esrgear.com/wp-content/uploads/2021/08/Smooth-Silky-Feel-1.jpg); }</style></p>";

        String str3 = str2.replaceAll("\\n", "").replaceAll("\\\\n", "");
       // System.out.println(str3);


        // 找出dt_img
        String dt_regx = "\\.uc-dt-img\\d\\{ background-image: url\\((.+?)\\); \\}";
        Pattern p_dt = Pattern.compile(dt_regx);
        Matcher match_dt = p_dt.matcher(str3);

        while(match_dt.find()){
            String find_dt = match_dt.group(1);
            // System.out.println(find_dt);
            dt_icon_img_list.add(find_dt);
        }

       // String regx = "\\[ux_banner([\\s\\S])*\\/ux_banner\\]";
        String regx = "\\[ux_banner(.+?)\\/ux_banner\\]";
        // String reg = "\\[ux_banner[^\\[\\]]*?\\\\sbg=['\\"]?(.*?)['\\"]?(\\\\s.*?)?>([^><]*)/ux_banner\\]";
      //  String reg = "<" + element + "[^<>]*?\\\\s" + attr + "=['\\"]?(.*?)['\\"]?(\\\\s.*?)?>([^><]*)</" + element + ">";

        Pattern p = Pattern.compile(regx);
        Matcher match = p.matcher(str3);

        int i = 0;
        while(match.find()){
            String find = match.group();
            dealBanner(find, i);
          //  System.out.println(find);
            i++;
        }

        try {
            outputCsvFile();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void outputCsvFile() throws Exception{
        List<String> title1_list = new ArrayList<String>();
        title1_list.add("dt_text_title1");
        title1_list.add("dt_text_cont1");
        title1_list.add("dt_text_title2");
        title1_list.add("dt_text_cont2");
        title1_list.add("dt_text_title3");
        title1_list.add("dt_text_cont3");
        title1_list.add("dt_text_title4");
        title1_list.add("dt_text_cont4");

        title1_list.add("dt_icon1_img_id");
        title1_list.add("dt_icon1_txt");
        title1_list.add("dt_icon2_img_id");
        title1_list.add("dt_icon2_txt");
        title1_list.add("dt_icon3_img_id");
        title1_list.add("dt_icon3_txt");
        title1_list.add("dt_icon4_img_id");
        title1_list.add("dt_icon4_txt");


      //  BufferedWriter writer = new BufferedWriter (new OutputStreamWriter (new FileOutputStream (filePath,true),charSet));
        String filepath = "E:\\output\\a.csv";
        FileOutputStream fout = new FileOutputStream(filepath, true);
        OutputStreamWriter osw = new OutputStreamWriter(fout, "utf-8");
        BufferedWriter writer = new BufferedWriter(osw);
        try {


            for (String title : title1_list) {
                writer.write(title);
                writer.write(",");
            }
            writer.write("\r\n");

            for(int i = 0; i < dt_title_list.size(); i++){
                writer.write(dt_title_list.get(i));
                writer.write(",");
                writer.write(dt_cont_list.get(i));
                writer.write(",");
            }

            for(int k = 0; k < dt_icon_img_list.size(); k++){
                writer.write(dt_icon_img_list.get(k));
                writer.write(",");
                writer.write(dt_cont_list.get(k));
                writer.write(",");
            }

            writer.flush();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            writer.close();
        }

    }

    public static boolean dealBanner(String banner, int i){
        if(i == 0){
            dealDt(banner);
        }
        if(i <= 1){
            return false;
        }
      //  System.out.println(dt_title_list);
        return true;
    }

    public static void dealDt(String banner){
        String regx = "<p class=\"uc-dt-title\">(.+?)</p>";
        Pattern p = Pattern.compile(regx);
        Matcher match = p.matcher(banner);
        while(match.find()){
            String find = match.group(1);
            // System.out.println(find);
            dt_title_list.add(find);
        }

        String regx2 = "<p class=\"uc-dt-cont\">(.+?)</p>";
        Pattern p2 = Pattern.compile(regx2);
        Matcher match2 = p2.matcher(banner);
        while(match2.find()){
            String find2 = match2.group(1);
            // System.out.println(find2);
            dt_cont_list.add(find2);
        }

        String regx3 = "<p class=\"uc-dt-icon-txt\">(.+?)</p>";
        Pattern p3 = Pattern.compile(regx3);
        Matcher match3 = p3.matcher(banner);
        while(match3.find()){
            String find3 = match3.group(1);
            // System.out.println(find2);
            dt_icon_list.add(find3);
        }
    }
}
