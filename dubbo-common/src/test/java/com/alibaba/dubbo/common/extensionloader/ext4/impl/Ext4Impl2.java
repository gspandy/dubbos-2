/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.common.extensionloader.ext4.impl;

import java.util.List;

import com.alibaba.dubbo.common.Extension;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extensionloader.ext4.Ext4;

/**
 * @author ding.lid
 *
 */
@Extension("impl2")
public class Ext4Impl2 implements Ext4 {
    public String echo(URL url, String s) {
        return "Ext3Impl2-echo";
    }
    
    public String yell(URL url, String s) {
        return "Ext3Impl2-yell";
    }

    public String bang(URL url, int i) {
        return "bang2";
    }
    
    public String bark(String name, List<Object> list) {
        return null;
    }
    
}