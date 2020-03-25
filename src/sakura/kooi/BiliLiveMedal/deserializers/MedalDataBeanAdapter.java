package sakura.kooi.BiliLiveMedal.deserializers;

import com.google.gson.*;
import sakura.kooi.BiliLiveMedal.entity.MedalEntity;

import java.lang.reflect.Type;

public class MedalDataBeanAdapter implements JsonDeserializer<MedalEntity.DataBean> {
    @Override
    public MedalEntity.DataBean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        MedalEntity.DataBean dataBean = new MedalEntity.DataBean();
        if (jsonElement.isJsonObject()) {
            JsonObject object = jsonElement.getAsJsonObject();
            object.entrySet().forEach(entry -> dataBean.getUsers().put(entry.getKey(), context.deserialize(entry.getValue(), MedalEntity.DataBean.UserBean.class)));
        }
        return dataBean;
    }
}
