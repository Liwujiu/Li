package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.VideoOrder;

import java.util.List;

/**
 * @ClassName: VideoOrderMapper
 * @Description:
 * @Author
 * @Date 2020/12/4
 * @Version 1.0
 */
public interface VideoOrderMapper {

    List<VideoOrder> queryVideoOrderList();

    List<User> queryUserOrder();
}
