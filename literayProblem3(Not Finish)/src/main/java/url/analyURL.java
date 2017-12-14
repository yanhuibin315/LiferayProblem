package url;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 对网址分析
 */
public class analyURL {
	
	
    /*
    判断网址是否符合正常网址要求
     */
    public boolean isLeagelURL(String url){
        //To Do...
        return false;
    }

    /*
    根据id，获取漫画名
     */
    public String getComicName(String url, String id){
    	//To Do...
        return null;
    }

    /*
    根据id，获取各章节标题
     */
    public ArrayList<String> getChapters(String url, String id){
    	ArrayList<String> as = new ArrayList<String>();
    	as.add("nba");
        return as;
    }

    /*
    根据id，提取url中<img>标签内容
     */
    public List<String> getImg(String url, String id){
        //To Do...
        return null;
    }
}
