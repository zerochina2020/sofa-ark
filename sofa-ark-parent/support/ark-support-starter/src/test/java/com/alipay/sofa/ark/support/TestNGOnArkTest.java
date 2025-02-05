/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.ark.support;

import com.alipay.sofa.ark.container.test.TestClassLoader;
import com.alipay.sofa.ark.support.listener.TestNGOnArk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author qilong.zql
 * @since 0.1.0
 */
@TestNGOnArk
public class TestNGOnArkTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestNGCommonTest.class);

    // @Test
    // public void test() {
    //     ClassLoader threadClassLoader = Thread.currentThread().getContextClassLoader();
    //     ClassLoader thisClassLoader = this.getClass().getClassLoader();
    //
    //     LOG.info("当前线程类加载器：{}, 当前类加载器：{}", threadClassLoader, thisClassLoader);
    //     Assert.assertTrue(threadClassLoader.getClass().getCanonicalName()
    //         .equals(TestClassLoader.class.getCanonicalName()));
    //     Assert.assertTrue(thisClassLoader.getClass().getCanonicalName()
    //         .equals(TestClassLoader.class.getCanonicalName()));
    // }

}