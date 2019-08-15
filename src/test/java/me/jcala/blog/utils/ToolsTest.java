package me.jcala.blog.utils;

import me.jcala.blog.md5.MD5Code;
import org.junit.Test;

/**
 * Created by Administrator on 2016/9/3.
 */
public class ToolsTest {
    @Test
    public void testGetTagList(){
        System.out.println(System.getProperty("user.dir"));
    }

    @Test
    public void test(){
        MD5Code md5 = new MD5Code();
        System.out.println(md5.getMD5ofStr("yxl..96124"));
    }
}
