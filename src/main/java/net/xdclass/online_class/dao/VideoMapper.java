package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface VideoMapper {


    /**
     * 根据视频id查找视频对象
     * @param videoId
     * @return
     */
    Video selectById(@Param("video_id") int videoId);


    /**
     * 查询全部视频列表
     * @return
     */
    List<Video> selectListByXML();



    /**
     * 查询全部视频列表
     * @return
     */
    @Select("select * from video")
    List<Video> selectList();

    /**
     * 
     * @param point
     * @param title 
     * @return net.xdclass.online_class.domain.Video
     * @author yuxin
     * @creed: Talk is cheap,show me the code
     * @date 2020/12/2 9:42
     */
    List<Video> selectByPointAndTitlelike(@Param("point") double point,@Param("title") String title);

    int add(Video video);

    int addBatch(List<Video> videos);

    int update(Video video);

    int selectiveupdatevideo(Video video);

    int deletevideo(Map<String,Object> map);

    Video selectBaseFieldByIdWithResultMap(@Param("video_id") Integer id);
}
