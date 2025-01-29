/*

* MC Journey for minecraft 1.21-1.21.1 by CODEZPC

! 这其中的物品注册在 1.21.2 后进行了更改，需要大范围修改

*/
//包名称
//Package name
package com.code;

//基本包导入
//Basic package import
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.code.Codeblocks.codeblocks;
import com.code.Codeitems.codeitems;
import com.code.Codeloot.codeloottables;
import com.code.Codeeffects.codeeffects;

import net.fabricmc.api.ModInitializer;

//主函数
//Main function
public class MCJourney implements ModInitializer {
    //定义日志输出器
    //Define log outputter
    public static final Logger LOGGER = LoggerFactory.getLogger("code");
    //LOGGER.xxx("xxx");
    @Override
    public void onInitialize() {
        codeblocks.Registry_Blocks();
        codeitems.Registry_Items();
        codeloottables.modifyLootTables_STRUCTURES();
        codeloottables.modifyLootTables_ENTITIES();
        codeeffects.Registry_Effects();
    }
}
