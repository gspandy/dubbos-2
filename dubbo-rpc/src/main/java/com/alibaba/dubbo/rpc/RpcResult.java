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
package com.alibaba.dubbo.rpc;

import java.io.Serializable;

/**
 * Generic rpc invoke result.
 * 
 * @serial Don't change the class name and properties.
 * @author qianlei
 */
public class RpcResult implements Result, Serializable {

    private static final long        serialVersionUID = -6925924956850004727L;

    private Object                   result;

    private Throwable                exception;

    public RpcResult(){
    }

    public RpcResult(Object result){
        this.result = result;
    }

    public RpcResult(Throwable exception){
        this.exception = exception;
    }

    public Object recreate() throws Throwable {
        if (exception != null) {
            throw exception;
        }
        return result;
    }

    /**
     * @deprecated Replace to getValue()
     * @see com.alibaba.dubbo.rpc.RpcResult#getValue()
     */
    @Deprecated
    public Object getResult() {
        return getValue();
    }

    public void setResult(Object result) {
        setValue(result);
    }

    public Object getValue() {
        return result;
    }

    public void setValue(Object result) {
        this.result = result;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable e) {
        this.exception = e;
    }

    public boolean hasException() {
        return exception != null;
    }

    @Override
    public String toString() {
        return "RpcResult [result=" + result + ", exception=" + exception + "]";
    }
}