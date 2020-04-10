package sakura.kooi.BiliLiveMedal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import sakura.kooi.BiliLiveMedal.deserializers.MedalDataBeanAdapter;
import sakura.kooi.BiliLiveMedal.deserializers.MedalUserBeanAdapter;
import sakura.kooi.BiliLiveMedal.entity.MedalEntity;

public class Constants {
    public static final String VERSION = "ALPHA-1.14-fb95537";

    @Getter
    private static Gson gson = new GsonBuilder()
            .registerTypeAdapter(MedalEntity.DataBean.class, new MedalDataBeanAdapter())
            .registerTypeAdapter(MedalEntity.DataBean.UserBean.class, new MedalUserBeanAdapter())
            .create();
}
