package sakura.kooi.BiliLiveMedal.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class MedalEntity {
    /**
     * code : 0
     * msg : success
     * message : success
     * data : {}
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
        @Expose(deserialize = false)
        private Map<String, UserBean> users = new HashMap<>();

        @Getter
        public static class UserBean {
            /**
             * medal : {}
             */
            @Expose(deserialize = false)
            private Map<String, MedalBean> medals = new HashMap<>();

            @Getter
            public static class MedalBean {
                /**
                 * uid : 3874987
                 * target_id : 11073
                 * medal_id : 1865
                 * score : 30
                 * level : 1
                 * intimacy : 30
                 * status : 0
                 * source : 1
                 * receive_channel : 1
                 * is_receive : 1
                 * master_status : 0
                 * receive_time : 2018-01-28 14:02:02
                 * today_intimacy : 0
                 * last_wear_time : 0
                 * medal_name : 憨色
                 * master_available : 1
                 * guard_type : 0
                 * lpl_status : 0
                 * target_name : hanser
                 * target_face : https://i1.hdslb.com/bfs/face/0eea1850f6e08c29af7b61dbfe5ec555babe7741.jpg
                 * live_stream_status : 0
                 * icon_code : 0
                 * icon_text :
                 * rank : -
                 * medal_color : 9953448
                 * today_feed : 0
                 * day_limit : 500
                 * next_intimacy : 201
                 * master_id : 11073
                 * roomid : 0
                 */

                @SerializedName("uid")
                private int uid;
                @SerializedName("target_id")
                private int targetId;
                @SerializedName("medal_id")
                private int medalId;
                @SerializedName("score")
                private int score;
                @SerializedName("level")
                private int level; // 等级
                @SerializedName("intimacy")
                private int intimacy; // 当前亲密
                @SerializedName("status")
                private int status;
                @SerializedName("source")
                private int source;
                @SerializedName("receive_channel")
                private int receiveChannel;
                @SerializedName("is_receive")
                private int isReceive;
                @SerializedName("master_status")
                private int masterStatus;
                @SerializedName("receive_time")
                private String receiveTime;
                @SerializedName("today_intimacy")
                private int todayIntimacy; // 今日亲密
                @SerializedName("last_wear_time")
                private int lastWearTime;
                @SerializedName("medal_name")
                private String medalName; // 牌子
                @SerializedName("master_available")
                private int masterAvailable;
                @SerializedName("guard_type")
                private int guardType;
                @SerializedName("lpl_status")
                private int lplStatus;
                @SerializedName("target_name")
                private String targetName; // 主播
                @SerializedName("target_face")
                private String targetFace;
                @SerializedName("live_stream_status")
                private int liveStreamStatus;
                @SerializedName("icon_code")
                private int iconCode;
                @SerializedName("icon_text")
                private String iconText;
                @SerializedName("rank")
                private String rank;
                @SerializedName("medal_color")
                private int medalColor; // 牌子颜色
                @SerializedName("today_feed")
                private int todayFeed;
                @SerializedName("day_limit")
                private int dayLimit; // 亲密上限
                @SerializedName("next_intimacy")
                private int nextIntimacy; // 升级所需亲密
                @SerializedName("master_id")
                private int masterId; // 主播UID (不是房间号)
                @SerializedName("roomid")
                private int roomid; // 永远是0
            }
        }
    }
}
