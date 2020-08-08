package com.xiaozh.designPattern.Proxy.CGLIB;

/**
 * 作者：小旋锋
    *   链接：https://juejin.im/post/5c1ca8df6fb9a049b347f55c
    *   来源：掘金
    *   著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *  */
public class UserDao {
    public void select() {
        System.out.println("UserDao 查询 selectById");
    }
    public void update() {
        System.out.println("UserDao 更新 update");
    }
}

