package com.bah.lucene;

/**
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
import org.junit.Test;

import com.bah.lucene.blockcache_v2.BaseCache.STORE;

public class CacheDirectoryTestSuiteOffHeap extends CacheDirectoryTestSuite {

  @Test
  public void runsTheTests() {
  }

  @Override
  protected STORE getStore() {
    return STORE.OFF_HEAP;
  }

}
