package com.lurey.lease.web.admin.custom.converter;

import com.lurey.lease.model.enums.ItemType;
import org.springframework.core.convert.converter.Converter;//注意这里导入的包的种类，不要导错了
import org.springframework.stereotype.Component;

@Component
public class StringToItemTypeConverter implements Converter<String, ItemType> {
    @Override
//    效率太低，
//    public ItemType convert(String code) {
//        if ("1".equals(code)){
//            return ItemType.APARTMENT;
//        } else if ("2".equals(code)) {
//            return ItemType.ROOM;
//        }
//        throw new IllegalArgumentException("code:"+code+"非法");
//    }
    public ItemType convert(String code) {

//        ItemType.class.getEnumConstants();//也能获取枚举类的所有实例对象
        ItemType[] values = ItemType.values();//获取枚举类的实例数组
        //遍历数组
        for (ItemType itemType : values) {
            if (itemType.getCode().equals(Integer.valueOf(code))){//这里传过来的code是string类型
                return itemType;
            }
        }
        throw new IllegalArgumentException("code:"+code+"非法");
    }
}