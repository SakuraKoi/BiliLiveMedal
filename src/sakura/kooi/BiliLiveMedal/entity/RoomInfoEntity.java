package sakura.kooi.BiliLiveMedal.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class RoomInfoEntity {

    /**
     * code : 0
     * msg : ok
     * message : ok
     * data : {"uid":2191383,"room_id":7811723,"short_id":0,"attention":47741,"online":9571,"is_portrait":false,"description":"<p>小狐神转播~<\/p>","live_status":0,"area_id":192,"parent_area_id":5,"parent_area_name":"电台","old_area_id":6,"background":"https://static.hdslb.com/live-static/images/bg/2.jpg","title":"【Soy】萌新狐狐早安闲聊台","user_cover":"https://i0.hdslb.com/bfs/live/new_room_cover/c99bfd08270ef4a8f9259a114da59cb3353edc78.jpg","keyframe":"https://i0.hdslb.com/bfs/live/keyframe03250820000007811723g4otgn.jpg","is_strict_room":false,"live_time":"0000-00-00 00:00:00","tags":"","is_anchor":0,"room_silent_type":"","room_silent_level":0,"room_silent_second":0,"area_name":"聊天电台","pendants":"","area_pendants":"","hot_words":["2333333","喂，妖妖零吗","红红火火恍恍惚惚","FFFFFFFFFF","Yooooooo","啪啪啪啪啪","666666666","老司机带带我","你为什么这么熟练啊","gg","prprpr","向大佬低头","请大家注意弹幕礼仪哦！","还有这种操作！","囍","打call","你气不气？","队友呢？"],"hot_words_status":0,"verify":"","new_pendants":{"frame":{"name":"","value":"","position":0,"desc":"","area":0,"area_old":0,"bg_color":"","bg_pic":"","use_old_area":false},"badge":null,"mobile_frame":{"name":"","value":"","position":0,"desc":"","area":0,"area_old":0,"bg_color":"","bg_pic":"","use_old_area":false},"mobile_badge":null},"up_session":"","pk_status":0,"pk_id":0,"battle_id":0,"allow_change_area_time":0,"allow_upload_cover_time":0,"studio_info":{"status":0,"master_list":[]}}
     */

    @SerializedName("code")
    private int code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private DataBean data;

    @Getter
    public static class DataBean {
        /**
         * uid : 2191383
         * room_id : 7811723
         * short_id : 0
         * attention : 47741
         * online : 9571
         * is_portrait : false
         * description : <p>小狐神转播~</p>
         * live_status : 0
         * area_id : 192
         * parent_area_id : 5
         * parent_area_name : 电台
         * old_area_id : 6
         * background : https://static.hdslb.com/live-static/images/bg/2.jpg
         * title : 【Soy】萌新狐狐早安闲聊台
         * user_cover : https://i0.hdslb.com/bfs/live/new_room_cover/c99bfd08270ef4a8f9259a114da59cb3353edc78.jpg
         * keyframe : https://i0.hdslb.com/bfs/live/keyframe03250820000007811723g4otgn.jpg
         * is_strict_room : false
         * live_time : 0000-00-00 00:00:00
         * tags :
         * is_anchor : 0
         * room_silent_type :
         * room_silent_level : 0
         * room_silent_second : 0
         * area_name : 聊天电台
         * pendants :
         * area_pendants :
         * hot_words : ["2333333","喂，妖妖零吗","红红火火恍恍惚惚","FFFFFFFFFF","Yooooooo","啪啪啪啪啪","666666666","老司机带带我","你为什么这么熟练啊","gg","prprpr","向大佬低头","请大家注意弹幕礼仪哦！","还有这种操作！","囍","打call","你气不气？","队友呢？"]
         * hot_words_status : 0
         * verify :
         * new_pendants : {"frame":{"name":"","value":"","position":0,"desc":"","area":0,"area_old":0,"bg_color":"","bg_pic":"","use_old_area":false},"badge":null,"mobile_frame":{"name":"","value":"","position":0,"desc":"","area":0,"area_old":0,"bg_color":"","bg_pic":"","use_old_area":false},"mobile_badge":null}
         * up_session :
         * pk_status : 0
         * pk_id : 0
         * battle_id : 0
         * allow_change_area_time : 0
         * allow_upload_cover_time : 0
         * studio_info : {"status":0,"master_list":[]}
         */

        @SerializedName("uid")
        private int uid;
        @SerializedName("room_id")
        private int roomId;
        @SerializedName("short_id")
        private int shortId;
        @SerializedName("attention")
        private int attention;
        @SerializedName("online")
        private int online;
        @SerializedName("is_portrait")
        private boolean isPortrait;
        @SerializedName("description")
        private String description;
        @SerializedName("live_status")
        private int liveStatus;
        @SerializedName("area_id")
        private int areaId;
        @SerializedName("parent_area_id")
        private int parentAreaId;
        @SerializedName("parent_area_name")
        private String parentAreaName;
        @SerializedName("old_area_id")
        private int oldAreaId;
        @SerializedName("background")
        private String background;
        @SerializedName("title")
        private String title;
        @SerializedName("user_cover")
        private String userCover;
        @SerializedName("keyframe")
        private String keyframe;
        @SerializedName("is_strict_room")
        private boolean isStrictRoom;
        @SerializedName("live_time")
        private String liveTime;
        @SerializedName("tags")
        private String tags;
        @SerializedName("is_anchor")
        private int isAnchor;
        @SerializedName("room_silent_type")
        private String roomSilentType;
        @SerializedName("room_silent_level")
        private int roomSilentLevel;
        @SerializedName("room_silent_second")
        private int roomSilentSecond;
        @SerializedName("area_name")
        private String areaName;
        @SerializedName("pendants")
        private String pendants;
        @SerializedName("area_pendants")
        private String areaPendants;
        @SerializedName("hot_words_status")
        private int hotWordsStatus;
        @SerializedName("verify")
        private String verify;
        @SerializedName("new_pendants")
        private NewPendantsBean newPendants;
        @SerializedName("up_session")
        private String upSession;
        @SerializedName("pk_status")
        private int pkStatus;
        @SerializedName("pk_id")
        private int pkId;
        @SerializedName("battle_id")
        private int battleId;
        @SerializedName("allow_change_area_time")
        private int allowChangeAreaTime;
        @SerializedName("allow_upload_cover_time")
        private int allowUploadCoverTime;
        @SerializedName("studio_info")
        private StudioInfoBean studioInfo;
        @SerializedName("hot_words")
        private List<String> hotWords;

        @Getter
        public static class NewPendantsBean {
            /**
             * frame : {"name":"","value":"","position":0,"desc":"","area":0,"area_old":0,"bg_color":"","bg_pic":"","use_old_area":false}
             * badge : null
             * mobile_frame : {"name":"","value":"","position":0,"desc":"","area":0,"area_old":0,"bg_color":"","bg_pic":"","use_old_area":false}
             * mobile_badge : null
             */

            @SerializedName("frame")
            private FrameBean frame;
            @SerializedName("badge")
            private Object badge;
            @SerializedName("mobile_frame")
            private MobileFrameBean mobileFrame;
            @SerializedName("mobile_badge")
            private Object mobileBadge;

            @Getter
            public static class FrameBean {
                /**
                 * name :
                 * value :
                 * position : 0
                 * desc :
                 * area : 0
                 * area_old : 0
                 * bg_color :
                 * bg_pic :
                 * use_old_area : false
                 */

                @SerializedName("name")
                private String name;
                @SerializedName("value")
                private String value;
                @SerializedName("position")
                private int position;
                @SerializedName("desc")
                private String desc;
                @SerializedName("area")
                private int area;
                @SerializedName("area_old")
                private int areaOld;
                @SerializedName("bg_color")
                private String bgColor;
                @SerializedName("bg_pic")
                private String bgPic;
                @SerializedName("use_old_area")
                private boolean useOldArea;
            }
            @Getter
            public static class MobileFrameBean {
                /**
                 * name :
                 * value :
                 * position : 0
                 * desc :
                 * area : 0
                 * area_old : 0
                 * bg_color :
                 * bg_pic :
                 * use_old_area : false
                 */

                @SerializedName("name")
                private String name;
                @SerializedName("value")
                private String value;
                @SerializedName("position")
                private int position;
                @SerializedName("desc")
                private String desc;
                @SerializedName("area")
                private int area;
                @SerializedName("area_old")
                private int areaOld;
                @SerializedName("bg_color")
                private String bgColor;
                @SerializedName("bg_pic")
                private String bgPic;
                @SerializedName("use_old_area")
                private boolean useOldArea;
            }
        }

        @Getter
        public static class StudioInfoBean {
            /**
             * status : 0
             * master_list : []
             */

            @SerializedName("status")
            private int status;
            @SerializedName("master_list")
            private List<?> masterList;
        }
    }
}
