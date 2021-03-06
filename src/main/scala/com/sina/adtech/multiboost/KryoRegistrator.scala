/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sina.adtech.multiboost

import com.esotericsoftware.kryo.Kryo

class KryoRegistrator extends org.apache.spark.serializer.KryoRegistrator {
  override def registerClasses(kryo: Kryo) = {
    kryo.register(classOf[org.apache.spark.mllib.classification.multilabel.baselearners.BaseLearnerModel])
    kryo.register(classOf[org.apache.spark.mllib.classification.multilabel.baselearners.FeatureCut])
    kryo.register(classOf[org.apache.spark.mllib.classification.multilabel.baselearners.DecisionStumpModel])
    kryo.register(classOf[org.apache.spark.mllib.classification.multilabel.baselearners.DecisionStumpAlgorithm.SplitMetric])
    kryo.register(classOf[org.apache.spark.mllib.classification.multilabel.baselearners.LRClassificationModel])
    kryo.register(classOf[org.apache.spark.mllib.classification.multilabel.baselearners.SVMClassificationModel])
    kryo.register(classOf[org.apache.spark.mllib.util.WeightedMultiLabeledPoint])
    kryo.register(classOf[org.apache.spark.mllib.util.MultiLabeledPoint])
  }
}

