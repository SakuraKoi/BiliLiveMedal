package sakura.kooi.BiliLiveMedal.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class RoomRankEntity {

    /**
     * code : 0
     * msg : OK
     * message : OK
     * data : {"medal":{"status":2},"own":{"uid":3874987,"uname":"SakuraKooi","face":"https://i2.hdslb.com/bfs/face/9db8594c646ffed56474a3ec91d7af4b27ddd5e8.jpg","target_id":2191383,"medal_name":"soya","level":15,"color":16746162,"rank":11,"special":"","isMax":0,"guard_level":0,"rank_text":"11"},"list":[{"uid":22855775,"uname":"我想和爱丽丝谈恋爱_","face":"https://i0.hdslb.com/bfs/face/3da1d3c9c4ca282216e0dcd4c3d3adb08b3eda27.jpg","rank":1,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":3},{"uid":352076508,"uname":"樱花suki","face":"https://i0.hdslb.com/bfs/face/00ccc3d2b6cf1a0d5cbb19aa56d98b8318e94bdb.jpg","rank":2,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":3},{"uid":8877919,"uname":"Soy_羽酱","face":"https://i1.hdslb.com/bfs/face/ce3f4864f4852c02dedd25b85ca0f14b2956e37b.jpg","rank":3,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":3},{"uid":131490202,"uname":"小白一白","face":"https://i2.hdslb.com/bfs/face/4a0bfb2d4da03ea255dc501ce721f54369b5ec09.jpg","rank":4,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":3},{"uid":12597559,"uname":"Kimiang","face":"https://i0.hdslb.com/bfs/face/1029a0b009888bd37589042c539d77a357d1f54c.jpg","rank":5,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":34274785,"uname":"夜瞳ゆき_Official","face":"https://i2.hdslb.com/bfs/face/22e671db22744fb0dc0ef293fe64dadff9684b50.jpg","rank":6,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":22631082,"uname":"病娇℃","face":"https://i1.hdslb.com/bfs/face/b9ed38b19fb3267f9134415da0e4263705d8e742.jpg","rank":7,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":45982588,"uname":"救救豹豹","face":"https://i0.hdslb.com/bfs/face/c3ff82c216567e268ff33462b1ca35df7943d4c2.jpg","rank":8,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":16115159,"uname":"抹茶年儿冻年糕","face":"https://i2.hdslb.com/bfs/face/923e6e100ceeacb5b91193df54291a4fa2b8cb5b.jpg","rank":9,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":10047828,"uname":"_Yusing","face":"https://i2.hdslb.com/bfs/face/7e877f13b7de1b92aa2d2e154461bcfb82aef28b.jpg","rank":10,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0}]}
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
         * medal : {"status":2}
         * own : {"uid":3874987,"uname":"SakuraKooi","face":"https://i2.hdslb.com/bfs/face/9db8594c646ffed56474a3ec91d7af4b27ddd5e8.jpg","target_id":2191383,"medal_name":"soya","level":15,"color":16746162,"rank":11,"special":"","isMax":0,"guard_level":0,"rank_text":"11"}
         * list : [{"uid":22855775,"uname":"我想和爱丽丝谈恋爱_","face":"https://i0.hdslb.com/bfs/face/3da1d3c9c4ca282216e0dcd4c3d3adb08b3eda27.jpg","rank":1,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":3},{"uid":352076508,"uname":"樱花suki","face":"https://i0.hdslb.com/bfs/face/00ccc3d2b6cf1a0d5cbb19aa56d98b8318e94bdb.jpg","rank":2,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":3},{"uid":8877919,"uname":"Soy_羽酱","face":"https://i1.hdslb.com/bfs/face/ce3f4864f4852c02dedd25b85ca0f14b2956e37b.jpg","rank":3,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":3},{"uid":131490202,"uname":"小白一白","face":"https://i2.hdslb.com/bfs/face/4a0bfb2d4da03ea255dc501ce721f54369b5ec09.jpg","rank":4,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":3},{"uid":12597559,"uname":"Kimiang","face":"https://i0.hdslb.com/bfs/face/1029a0b009888bd37589042c539d77a357d1f54c.jpg","rank":5,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":34274785,"uname":"夜瞳ゆき_Official","face":"https://i2.hdslb.com/bfs/face/22e671db22744fb0dc0ef293fe64dadff9684b50.jpg","rank":6,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":22631082,"uname":"病娇℃","face":"https://i1.hdslb.com/bfs/face/b9ed38b19fb3267f9134415da0e4263705d8e742.jpg","rank":7,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":45982588,"uname":"救救豹豹","face":"https://i0.hdslb.com/bfs/face/c3ff82c216567e268ff33462b1ca35df7943d4c2.jpg","rank":8,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":16115159,"uname":"抹茶年儿冻年糕","face":"https://i2.hdslb.com/bfs/face/923e6e100ceeacb5b91193df54291a4fa2b8cb5b.jpg","rank":9,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0},{"uid":10047828,"uname":"_Yusing","face":"https://i2.hdslb.com/bfs/face/7e877f13b7de1b92aa2d2e154461bcfb82aef28b.jpg","rank":10,"medal_name":"soya","level":15,"color":16746162,"target_id":2191383,"special":"","isSelf":0,"guard_level":0}]
         */

        @SerializedName("medal")
        private StatusBean medal;
        @SerializedName("own")
        private MedalBean own;
        @SerializedName("list")
        private List<MedalBean> list;

        @Getter
        public static class StatusBean {
            /**
             * status : 2
             */

            @SerializedName("status")
            private int status;
        }

        @Getter
        public static class MedalBean {
            /**
             * uid : 22855775
             * uname : 我想和爱丽丝谈恋爱_
             * face : https://i0.hdslb.com/bfs/face/3da1d3c9c4ca282216e0dcd4c3d3adb08b3eda27.jpg
             * rank : 1
             * medal_name : soya
             * level : 15
             * color : 16746162
             * target_id : 2191383
             * special :
             * isSelf : 0
             * guard_level : 3
             */

            @SerializedName("uid")
            private int uid;
            @SerializedName("uname")
            private String uname;
            @SerializedName("face")
            private String face;
            @SerializedName("rank")
            private int rank;
            @SerializedName("medal_name")
            private String medalName;
            @SerializedName("level")
            private int level;
            @SerializedName("color")
            private int color;
            @SerializedName("target_id")
            private int targetId;
            @SerializedName("special")
            private String special;
            @SerializedName("isSelf")
            private int isSelf;
            @SerializedName("guard_level")
            private int guardLevel;
        }
    }
}
