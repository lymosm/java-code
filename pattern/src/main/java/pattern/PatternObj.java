package pattern;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;

public class PatternObj {

    static final String jdbc_driver = "com.mysql.jdbc.Driver";
    static final String db_url = "jdbc:mysql://localhost:3306/www_esr";
    static Connection conn = null;
    static Statement stmt = null;
    static final String user = "root";
    static final String password = "root";

    public static List <String> dt_title_list = new ArrayList();
    public static List <String> dt_cont_list = new ArrayList<String>();
    public static List <String> dt_icon_list = new ArrayList<String>();
    public static List <String> dt_icon_img_list = new ArrayList<String>();

    public static List <String> common_title_list = new ArrayList<String>();
    public static List <String> common_field_list = new ArrayList<String>();

    public static int mo3_img_id_index = 1;
    public static int mo3_txt_title_index = 1;
    public static int mo3_txt_detail_index = 1;

    public static int mo4_img_id_index = 1;
    public static int mo4_txt_title_index = 1;
    public static int mo4_txt_detail_index = 1;

    public static int mo5_video_url_index = 1;


    public static int mo2_pc_img_id_index = 1;
    public static int mo2_m_img_id_index = 1;
    public static int mo2_txt_title_index = 1;
    public static int mo2_txt_detail_index = 1;

    public static int mo6_txt_title_index = 1;
    public static int mo6_txt_detail_index = 1;

    public static void connect() throws Exception{
        Class.forName(jdbc_driver);
        conn = DriverManager.getConnection(db_url, user, password);
    }

    public static void query() throws Exception{
        stmt = conn.createStatement();
        String sql = "";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            Integer product_id =  rs.getInt("ID");
            String product_name = rs.getString("post_title");
            String cont = rs.getString("post_content");
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    public static void main(String args[]){
        System.out.println("start");
        String str = "J<a href=>ure 世界 的健康度<a hdur></a> sss" +
                "dkkkdl  <a href=''>ssdas</a>ddd";
        String str2 = "[ux_banner label=\"pc-top\" visibility=\"hide-for-small\" height=\"448px\" class=\"uc-top\"]\n" +
                "\n" +
                "            [text_box width=\"100\" position_x=\"50\" position_y=\"50\"]\n" +
                "            \n" +
                "            <div class=\"uc-dt-box\">\n" +
                "            <div class=\"uc-dt-item uc-dt-left\"><h3><p class=\"uc-dt-title\">aaa</p></h3><p class=\"uc-dt-cont\">aaaaaa</p><h3><p class=\"uc-dt-title\">bbb</p></h3><p class=\"uc-dt-cont\">bbbbb</p><h3><p class=\"uc-dt-title\">ccc</p></h3><p class=\"uc-dt-cont\">ccccccc</p><h3><p class=\"uc-dt-title\">dddd</p></h3><p class=\"uc-dt-cont\">dddddd</p></div><div class=\"uc-dt-item uc-dt-right\">\n" +
                "            <div class=\"uc-dt-icon-item\">\n" +
                "                <div class=\"uc-dt-icon\">\n" +
                "                    <div class=\"uc-dt-img uc-dt-img1\"></div><h4><p class=\"uc-dt-icon-txt\">aaa</p></h4> \n" +
                "                    </div>\n" +
                "                    <div class=\"uc-dt-icon\"><div class=\"uc-dt-img uc-dt-img2\"></div><h4><p class=\"uc-dt-icon-txt\">bbb</p></h4></div></div><div class=\"uc-dt-icon-item\">\n" +
                "                <div class=\"uc-dt-icon\">\n" +
                "                <div class=\"uc-dt-img uc-dt-img3\"></div><h4><p class=\"uc-dt-icon-txt\">cccc</p></h4></div><div class=\"uc-dt-icon\">\n" +
                "                <div class=\"uc-dt-img uc-dt-img4\"></div><h4><p class=\"uc-dt-icon-txt\">ddddd dd</p></h4></div></div></div>\n" +
                "    </div>\n" +
                "    \n" +
                "    [/text_box]\n" +
                "    \n" +
                "    [/ux_banner][ux_banner label=\"m-top\" visibility=\"show-for-small\" height=\"448px\" height__sm=\"84vh\" class=\"uc-top\"]\n" +
                "\n" +
                "            [text_box width=\"100\" position_x=\"50\" position_y=\"50\"]\n" +
                "            \n" +
                "            <div class=\"uc-dt-box\">\n" +
                "            <div class=\"uc-dt-item uc-dt-left\"><h3><p class=\"uc-dt-title\">aaa</p></h3><p class=\"uc-dt-cont\">aaaaaa</p><h3><p class=\"uc-dt-title\">bbb</p></h3><p class=\"uc-dt-cont\">bbbbb</p><h3><p class=\"uc-dt-title\">ccc</p></h3><p class=\"uc-dt-cont\">ccccccc</p><h3><p class=\"uc-dt-title\">dddd</p></h3><p class=\"uc-dt-cont\">dddddd</p></div><div class=\"uc-dt-item uc-dt-right\">\n" +
                "            <div class=\"uc-dt-icon-item\">\n" +
                "                <div class=\"uc-dt-icon\">\n" +
                "                    <div class=\"uc-dt-img uc-dt-img1\"></div><h4><p class=\"uc-dt-icon-txt\">aaa</p></h4>\n" +
                "                    </div>\n" +
                "                    <div class=\"uc-dt-icon\"><div class=\"uc-dt-img uc-dt-img2\"></div><h4><p class=\"uc-dt-icon-txt\">bbb</p></h4></div></div><div class=\"uc-dt-icon-item\">\n" +
                "                <div class=\"uc-dt-icon\">\n" +
                "                <div class=\"uc-dt-img uc-dt-img3\"></div><h4><p class=\"uc-dt-icon-txt\">cccc</p></h4></div><div class=\"uc-dt-icon\">\n" +
                "                <div class=\"uc-dt-img uc-dt-img4\"></div><h4><p class=\"uc-dt-icon-txt\">ddddd dd</p></h4></div></div></div>\n" +
                "    </div>\n" +
                "    \n" +
                "    [/text_box]\n" +
                "    \n" +
                "    [/ux_banner][ux_banner class=\"uc-img-txt\" height=\"14%\" bg_color=\"rgb(255, 255, 255)\"][text_box position_x=\"50\" position_y=\"50\" width=\"100%\"]\n" +
                "            <h2 class=\"uppercase\"><strong class=\"uc-txt-title\">ddf</strong></h2><p class=\"uc-txt-detail\">44444</p>\n" +
                "            [/text_box]  \n" +
                "            [/ux_banner][ux_banner class=\"uc-mo3 mo3-img\" height=\"30%\" bg=\"123126\" bg_size=\"original\"]\n" +
                "            [/ux_banner][ux_banner class=\"uc-mo3\" height=\"30%\"]\n" +
                "\n" +
                "            [text_box text_color=\"dark\" width=\"100%\" position_x=\"50\" position_y=\"50\"]\n" +
                "            \n" +
                "            <h2 class=\"uppercase\"><strong class=\"uc-txt-title\">85rfffdd</strong></h2><p class=\"uc-txt-detail\">55zss</p>\n" +
                "            [/text_box]   \n" +
                "            [/ux_banner][ux_banner class=\"uc-mo4 uc-float-right mo4-img\" height=\"30%\" bg=\"123126\" bg_size=\"original\"]\n" +
                "            [/ux_banner][ux_banner class=\"uc-mo4\" height=\"30%\"]\n" +
                "\n" +
                "            [text_box text_color=\"dark\" width=\"100%\" position_x=\"50\" position_y=\"50\"]\n" +
                "            \n" +
                "            <h2 class=\"uppercase\"><strong class=\"uc-txt-title\">kzsksue23\"siew\" sssd`sds'sdi'sssd</strong></h2><p class=\"uc-txt-detail\">58ssdee</p>\n" +
                "            [/text_box]   \n" +
                "            [/ux_banner][ux_banner label=\"video\" height=\"40%\" class=\"uc-mo5 uc-video\"]\n" +
                "        [text_box width=\"80\" position_x=\"50\" position_y=\"50\"]\n" +
                "\n" +
                "        [ux_video url=\"https://www.youtube.com/watch?v=hH9-RJ2vjEI\" height=\"50%\"]\n" +
                "        [/text_box][/ux_banner][ux_banner visibility=\"hide-for-small\" height=\"56%\" bg=\"123126\" bg_size=\"original\"][/ux_banner][ux_banner label=\"m\" visibility=\"show-for-small\" height=\"41%\" height__sm=\"70%\" bg=\"123126\" bg_size=\"original\"][/ux_banner][ux_banner class=\"uc-img-txt\" height=\"14%\" bg_color=\"rgb(255, 255, 255)\"][text_box position_x=\"50\" position_y=\"50\" width=\"100%\"]\n" +
                "            <h2 class=\"uppercase\"><strong class=\"uc-txt-title\">aiowuee</strong></h2><p class=\"uc-txt-detail\">kskksksks22</p>\n" +
                "            [/text_box]  \n" +
                "            [/ux_banner]<p><style>.uc-dt-img1{ background-image: url(https://lo.wp.com/wp-includes/images/media/default.png); }.uc-dt-img2{ background-image: url(https://lo.wp.com/wp-includes/images/media/default.png); }.uc-dt-img3{ background-image: url(https://lo.wp.com/wp-includes/images/media/default.png); }.uc-dt-img4{ background-image: url(https://lo.wp.com/wp-includes/images/media/default.png); }</style></p>";

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
            for(String common_title: common_title_list){
                writer.write(common_title);
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

            for(String field: common_field_list){
                writer.write(field);
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

        // mo3
        String regx_mo3_img = "class=\"uc-mo3 mo3-img\" height=\"30%\" bg=\"(\\d+)\"";
        Pattern mo3_img = Pattern.compile(regx_mo3_img);
        Matcher mo3_matcher = mo3_img.matcher(banner);
        while(mo3_matcher.find()){
            String mo3_img_str = mo3_matcher.group(1);
            dealMo3Img(mo3_img_str);
        }

        String regx_mo3_title = "class=\"uc-mo3\".+?class=\"uc-txt-title\">(.+?)</strong>";
        Pattern mo3_title = Pattern.compile(regx_mo3_title);
        Matcher mo3_title_match = mo3_title.matcher(banner);
        while(mo3_title_match.find()){
            String mo3_title_str = mo3_title_match.group(1);
            dealMo3Title(mo3_title_str);
        }

        String regx_mo3_detail = "class=\"uc-mo3\".+?<p class=\"uc-txt-detail\">(.+?)</p>";
        Pattern mo3_detail = Pattern.compile(regx_mo3_detail);
        Matcher mo3_detail_match = mo3_detail.matcher(banner);
        while(mo3_detail_match.find()){
            String mo3_detail_str = mo3_detail_match.group(1);
            dealMo3Detail(mo3_detail_str);
        }


        // mo4
        String regx_mo4_img = "class=\"uc-mo4 uc-float-right mo4-img\" height=\"30%\" bg=\"(\\d+)\"";
        Pattern mo4_img = Pattern.compile(regx_mo4_img);
        Matcher mo4_matcher = mo4_img.matcher(banner);
        while(mo4_matcher.find()){
            String mo4_img_str = mo4_matcher.group(1);
            dealMo4Img(mo4_img_str);
        }

        String regx_mo4_title = "class=\"uc-mo4\".+?class=\"uc-txt-title\">(.+?)</strong>";
        Pattern mo4_title = Pattern.compile(regx_mo4_title);
        Matcher mo4_title_match = mo4_title.matcher(banner);
        while(mo4_title_match.find()){
            String mo4_title_str = mo4_title_match.group(1);
            dealMo4Title(mo4_title_str);
        }

        String regx_mo4_detail = "class=\"uc-mo4\".+?<p class=\"uc-txt-detail\">(.+?)</p>";
        Pattern mo4_detail = Pattern.compile(regx_mo4_detail);
        Matcher mo4_detail_match = mo4_detail.matcher(banner);
        while(mo4_detail_match.find()){
            String mo4_detail_str = mo4_detail_match.group(1);
            dealMo4Detail(mo4_detail_str);
        }


        // mo5
        String regx_mo5 = "ux_video url=\"(.+?)\"";
        Pattern mo5 = Pattern.compile(regx_mo5);
        Matcher mo5_match = mo5.matcher(banner);
        while(mo5_match.find()){
            String mo5_str = mo5_match.group(1);
            dealMo5(mo5_str);
        }

        // mo2
        String regx_mo2_img = "height=\"56%\" bg=\"(\\d+)\"";
        Pattern mo2_img = Pattern.compile(regx_mo2_img);
        Matcher mo2_matcher = mo2_img.matcher(banner);
        while(mo2_matcher.find()){
            String mo2_img_str = mo2_matcher.group(1);
            dealMo2Img(mo2_img_str);
        }

        String regx_mo2_img_m = "height__sm=\"70%\" bg=\"(\\d+)\"";
        Pattern mo2_img_m = Pattern.compile(regx_mo2_img_m);
        Matcher mo2_matcher_m = mo2_img_m.matcher(banner);
        while(mo2_matcher_m.find()){
            String mo2_img_str_m = mo2_matcher_m.group(1);
            dealMo2ImgM(mo2_img_str_m);
        }

        String regx_mo2_title = "class=\"uc-img-txt\".+?class=\"uc-txt-title\">(.+?)</strong>";
        Pattern mo2_title = Pattern.compile(regx_mo2_title);
        Matcher mo2_title_match = mo2_title.matcher(banner);
        while(mo2_title_match.find()){
            String mo2_title_str = mo2_title_match.group(1);
            dealMo2Title(mo2_title_str);
        }

        String regx_mo2_detail = "class=\"uc-img-txt\".+?<p class=\"uc-txt-detail\">(.+?)</p>";
        Pattern mo2_detail = Pattern.compile(regx_mo2_detail);
        Matcher mo2_detail_match = mo2_detail.matcher(banner);
        while(mo2_detail_match.find()){
            String mo2_detail_str = mo2_detail_match.group(1);
            dealMo2Detail(mo2_detail_str);
        }

        // mo6
        String regx_mo6_title = "class=\"uc-mo6\".+?class=\"uc-txt-title\">(.+?)</strong>";
        Pattern mo6_title = Pattern.compile(regx_mo6_title);
        Matcher mo6_title_match = mo6_title.matcher(banner);
        while(mo6_title_match.find()){
            String mo6_title_str = mo6_title_match.group(1);
            dealMo6Title(mo6_title_str);
        }

        String regx_mo6_detail = "class=\"uc-mo6\".+?<p class=\"uc-txt-detail\">(.+?)</p>";
        Pattern mo6_detail = Pattern.compile(regx_mo6_detail);
        Matcher mo6_detail_match = mo6_detail.matcher(banner);
        while(mo6_detail_match.find()){
            String mo6_detail_str = mo6_detail_match.group(1);
            dealMo6Detail(mo6_detail_str);
        }


        System.out.println(common_title_list);
        System.out.println(common_field_list);

        return true;
    }


    public static void dealMo6Detail(String img){
        String key = "";
        if(mo6_txt_detail_index > 1){
            key = "mo6_txt_detail-" + String.valueOf(mo6_txt_detail_index);
        }else{
            key = "mo6_txt_detail";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo6_txt_detail_index++;
    }

    public static void dealMo6Title(String img){
        String key = "";
        if(mo6_txt_title_index > 1){
            key = "mo6_txt_title-" + String.valueOf(mo6_txt_title_index);
        }else{
            key = "mo6_txt_title";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo6_txt_title_index++;
    }


    public static void dealMo2Detail(String img){
        String key = "";
        if(mo2_txt_detail_index > 1){
            key = "mo2_txt_detail-" + String.valueOf(mo2_txt_detail_index);
        }else{
            key = "mo2_txt_detail";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo2_txt_detail_index++;
    }

    public static void dealMo2Title(String img){
        String key = "";
        if(mo2_txt_title_index > 1){
            key = "mo2_txt_title-" + String.valueOf(mo2_txt_title_index);
        }else{
            key = "mo2_txt_title";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo2_txt_title_index++;
    }

    public static void dealMo2Img(String img){
        String key = "";
        if(mo2_pc_img_id_index > 1){
            key = "mo2_pc_img_id-" + String.valueOf(mo2_pc_img_id_index);
        }else{
            key = "mo2_pc_img_id";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo2_pc_img_id_index++;
    }

    public static void dealMo2ImgM(String img){
        String key = "";
        if(mo2_m_img_id_index > 1){
            key = "mo2_m_img_id-" + String.valueOf(mo2_m_img_id_index);
        }else{
            key = "mo2_m_img_id";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo2_m_img_id_index++;
    }


    public static void dealMo5(String img){
        String key = "";
        if(mo5_video_url_index > 1){
            key = "mo5_video_url-" + String.valueOf(mo5_video_url_index);
        }else{
            key = "mo5_video_url";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo5_video_url_index++;
    }


    public static void dealMo4Detail(String img){
        String key = "";
        if(mo4_txt_detail_index > 1){
            key = "mo4_txt_detail-" + String.valueOf(mo4_txt_detail_index);
        }else{
            key = "mo4_txt_detail";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo4_txt_detail_index++;
    }

    public static void dealMo4Title(String img){
        String key = "";
        if(mo4_txt_title_index > 1){
            key = "mo4_txt_title-" + String.valueOf(mo4_txt_title_index);
        }else{
            key = "mo4_txt_title";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo4_txt_title_index++;
    }

    public static void dealMo4Img(String img){
        String key = "";
        if(mo4_img_id_index > 1){
            key = "mo4_img_id-" + String.valueOf(mo4_img_id_index);
        }else{
            key = "mo4_img_id";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo4_img_id_index++;
    }

    public static void dealMo3Detail(String img){
        String key = "";
        if(mo3_txt_detail_index > 1){
            key = "mo3_txt_detail-" + String.valueOf(mo3_txt_detail_index);
        }else{
            key = "mo3_txt_detail";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo3_txt_detail_index++;
    }

    public static void dealMo3Title(String img){
        String key = "";
        if(mo3_txt_title_index > 1){
            key = "mo3_txt_title-" + String.valueOf(mo3_txt_title_index);
        }else{
            key = "mo3_txt_title";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo3_txt_title_index++;
    }

    public static void dealMo3Img(String img){
        String key = "";
        if(mo3_img_id_index > 1){
             key = "mo3_img_id-" + String.valueOf(mo3_img_id_index);
        }else{
             key = "mo3_img_id";
        }
        common_title_list.add(key);
        common_field_list.add(img);
        mo3_img_id_index++;
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
