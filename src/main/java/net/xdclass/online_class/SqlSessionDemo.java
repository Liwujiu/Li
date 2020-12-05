package net.xdclass.online_class;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.dao.VideoOrderMapper;
import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.Video;
import net.xdclass.online_class.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class SqlSessionDemo {


    public static void main(String[] args) throws IOException {

        String resouce = "config/mybatis-config.xml";

        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resouce);

        //构建Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Session
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);

            VideoOrderMapper videoOrderMapper =sqlSession.getMapper(VideoOrderMapper.class);

            //Video video=videoMapper.selectBaseFieldByIdWithResultMap(45);

            //System.out.println(video.toString());

            //List<Video> videos = videoMapper.selectByPointAndTitlelike(8.7, "html");

            //System.out.println(videos.toString());

            //Video video = videoMapper.selectById(44);

            //System.out.println(video.toString());


            //通过注解
            //List<Video> videoList =  videoMapper.selectList();


            //List<Video> videoList = videoMapper.selectListByXML();

            //System.out.println(videoList.toString());
//            Video video2 = new Video();
//            video2.setTitle("test2222");
//            video2.setCoverImg("xdclass.net/aaa.png");
//            video2.setPoint(9.4);
//            video2.setCreateTime(new Date());
//            video2.setPrice(1000);
//            video2.setSummary("22222这是一个插入测试");
//            List<Video> videos = new ArrayList<>();
//            videos.add(video1);
//            videos.add(video2);
//            videoMapper.addBatch(videos);
            //System.out.println(videoMapper.add(video));
            //System.out.println(video.toString());
//
//            Map<String, Object> videomap = new HashMap<>();
//            videomap.put("price", "3000");
//            videomap.put("createTime", new Date());
//            videoMapper.deletevideo(videomap);

            //List<VideoOrder> videoOrderList=videoOrderMapper.queryVideoOrderList();
            //System.out.println(videoOrderList.toString());

            List<User> userList=videoOrderMapper.queryUserOrder();
            System.out.println(userList.toString());
        }

    }

}
