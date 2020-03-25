package sakura.kooi.BiliLiveMedal.entity;

import com.google.gson.annotations.SerializedName;

public class UserInfoEntity {

    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"mid":3874988,"name":"苏陌兮","sex":"保密","face":"http://i0.hdslb.com/bfs/face/member/noface.jpg","sign":"","rank":5000,"level":0,"jointime":0,"moral":0,"silence":0,"birthday":"","coins":0,"fans_badge":false,"official":{"role":0,"title":"","desc":"","type":-1},"vip":{"type":0,"status":0,"theme_type":0},"pendant":{"pid":0,"name":"","image":"","expire":0},"nameplate":{"nid":0,"name":"","image":"","image_small":"","level":"","condition":""},"is_followed":false,"top_photo":"http://i1.hdslb.com/bfs/space/cb1c3ef50e22b6096fde67febe863494caefebad.png","theme":{},"sys_notice":{}}
     */

    @SerializedName("code")
    public int code;
    @SerializedName("message")
    public String message;
    @SerializedName("ttl")
    public int ttl;
    @SerializedName("data")
    public DataBean data;

    public static class DataBean {
        /**
         * mid : 3874988
         * name : 苏陌兮
         * sex : 保密
         * face : http://i0.hdslb.com/bfs/face/member/noface.jpg
         * sign :
         * rank : 5000
         * level : 0
         * jointime : 0
         * moral : 0
         * silence : 0
         * birthday :
         * coins : 0
         * fans_badge : false
         * official : {"role":0,"title":"","desc":"","type":-1}
         * vip : {"type":0,"status":0,"theme_type":0}
         * pendant : {"pid":0,"name":"","image":"","expire":0}
         * nameplate : {"nid":0,"name":"","image":"","image_small":"","level":"","condition":""}
         * is_followed : false
         * top_photo : http://i1.hdslb.com/bfs/space/cb1c3ef50e22b6096fde67febe863494caefebad.png
         * theme : {}
         * sys_notice : {}
         */

        @SerializedName("mid")
        public int mid;
        @SerializedName("name")
        public String name;
        @SerializedName("sex")
        public String sex;
        @SerializedName("face")
        public String face;
        @SerializedName("sign")
        public String sign;
        @SerializedName("rank")
        public int rank;
        @SerializedName("level")
        public int level;
        @SerializedName("jointime")
        public int jointime;
        @SerializedName("moral")
        public int moral;
        @SerializedName("silence")
        public int silence;
        @SerializedName("birthday")
        public String birthday;
        @SerializedName("coins")
        public int coins;
        @SerializedName("fans_badge")
        public boolean fansBadge;
        @SerializedName("official")
        public OfficialBean official;
        @SerializedName("vip")
        public VipBean vip;
        @SerializedName("pendant")
        public PendantBean pendant;
        @SerializedName("nameplate")
        public NameplateBean nameplate;
        @SerializedName("is_followed")
        public boolean isFollowed;
        @SerializedName("top_photo")
        public String topPhoto;
        @SerializedName("theme")
        public ThemeBean theme;
        @SerializedName("sys_notice")
        public SysNoticeBean sysNotice;

        public static class OfficialBean {
            /**
             * role : 0
             * title :
             * desc :
             * type : -1
             */

            @SerializedName("role")
            public int role;
            @SerializedName("title")
            public String title;
            @SerializedName("desc")
            public String desc;
            @SerializedName("type")
            public int type;
        }

        public static class VipBean {
            /**
             * type : 0
             * status : 0
             * theme_type : 0
             */

            @SerializedName("type")
            public int type;
            @SerializedName("status")
            public int status;
            @SerializedName("theme_type")
            public int themeType;
        }

        public static class PendantBean {
            /**
             * pid : 0
             * name :
             * image :
             * expire : 0
             */

            @SerializedName("pid")
            public int pid;
            @SerializedName("name")
            public String name;
            @SerializedName("image")
            public String image;
            @SerializedName("expire")
            public int expire;
        }

        public static class NameplateBean {
            /**
             * nid : 0
             * name :
             * image :
             * image_small :
             * level :
             * condition :
             */

            @SerializedName("nid")
            public int nid;
            @SerializedName("name")
            public String name;
            @SerializedName("image")
            public String image;
            @SerializedName("image_small")
            public String imageSmall;
            @SerializedName("level")
            public String level;
            @SerializedName("condition")
            public String condition;
        }

        public static class ThemeBean {
        }

        public static class SysNoticeBean {
        }
    }
}
