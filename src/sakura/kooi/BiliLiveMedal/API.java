package sakura.kooi.BiliLiveMedal;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import sakura.kooi.BiliLiveMedal.entity.*;

import java.util.List;

public class API {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread((Unirest::shutDown)));
    }
    public static RoomInfoEntity roomInfo(long room) {
        String url = "https://api.live.bilibili.com/room/v1/Room/get_info?id="+room;
        HttpResponse<String> response = Unirest.get(url).asString();
        if (response.getStatus() == 200) {
            RoomInfoEntity roomInfoEntity = Constants.getGson().fromJson(response.getBody(), RoomInfoEntity.class);
            if (roomInfoEntity.getCode() != 0) throw new BiliException(roomInfoEntity.getCode()+" "+roomInfoEntity.getMessage());
            return roomInfoEntity;
        } else throw new BiliException("Bilibili服务器返回 HTTP错误码 "+response.getStatus());
    }
    public static UserInfoEntity userInfo(long uid) {
        String url = "https://api.bilibili.com/x/space/acc/info?mid=" + uid + "&jsonp=jsonp";
        HttpResponse<String> response = Unirest.get(url).asString();
        if (response.getStatus() == 200) {
            UserInfoEntity userInfoEntity = Constants.getGson().fromJson(response.getBody(), UserInfoEntity.class);
            if (userInfoEntity.code != 0) throw new BiliException(userInfoEntity.code+" "+userInfoEntity.message);
            return userInfoEntity;
        } else throw new BiliException("Bilibili服务器返回 HTTP错误码 "+response.getStatus());
    }

    public static RoomRankEntity roomRankWeb(long room, long streamerUid) {
        String url = "https://api.live.bilibili.com/rankdb/v1/RoomRank/webMedalRank?roomid=" + room + "&ruid=" + streamerUid;
        HttpResponse<String> response = Unirest.get(url).asString();
        if (response.getStatus() == 200) {
            RoomRankEntity roomRankEntity = Constants.getGson().fromJson(response.getBody(), RoomRankEntity.class);
            if (roomRankEntity.getCode() != 0) throw new BiliException(roomRankEntity.getCode()+" "+roomRankEntity.getMessage());
            return roomRankEntity;
        } else throw new BiliException("Bilibili服务器返回 HTTP错误码 "+response.getStatus());
    }

    public static RoomRankEntity roomRankMobile(long room, long streamerUid, int page) {
        String url = "https://api.live.bilibili.com/rankdb/v2/RoomRank/mobileMedalRank?roomid=" + room + "&ruid=" + streamerUid + "&page=" + page;
        HttpResponse<String> response = Unirest.get(url).asString();
        if (response.getStatus() == 200) {
            RoomRankEntity roomRankEntity = Constants.getGson().fromJson(response.getBody(), RoomRankEntity.class);
            if (roomRankEntity.getCode() != 0) throw new BiliException(roomRankEntity.getCode()+" "+roomRankEntity.getMessage());
            return roomRankEntity;
        } else throw new BiliException("Bilibili服务器返回 HTTP错误码 "+response.getStatus());
    }

    public static MedalEntity liveMedals(List<Long> uidList) {
        String url = "https://api.live.bilibili.com/user/v2/User/getMultiple?" + joinUidList(uidList) + "attributes[]=medal";
        HttpResponse<String> response = Unirest.get(url).asString();
        if (response.getStatus() == 200) {
            MedalEntity medalEntity = Constants.getGson().fromJson(response.getBody(), MedalEntity.class);
            if (medalEntity.getCode() == 500003) throw new BiliException("所查询的用户没有任何粉丝勋章");
            if (medalEntity.getCode() != 0) throw new BiliException(medalEntity.getCode()+" "+medalEntity.getMessage());
            return medalEntity;
        } else throw new BiliException("Bilibili服务器返回 HTTP错误码 "+response.getStatus());
    }

    private static String joinUidList(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i<list.size(); i++) {
            sb.append("uids[").append(i).append("]=").append(list.get(i)).append('&');
        }
        return sb.toString();
    }

    public static UserFollowEntity getFollowing(long uid, int page) {
        String url = "https://api.bilibili.com/x/relation/followings?vmid="+uid+"&pn="+page+"&ps=50&order=desc&jsonp=jsonp";
        HttpResponse<String> response = Unirest.get(url).asString();
        if (response.getStatus() == 200) {
            UserFollowEntity followEntity = Constants.getGson().fromJson(response.getBody(), UserFollowEntity.class);
            if (followEntity.code != 0) throw new BiliException(followEntity.code+" "+followEntity.message);
            return followEntity;
        } else throw new BiliException("Bilibili服务器返回 HTTP错误码 "+response.getStatus());
    }
}
