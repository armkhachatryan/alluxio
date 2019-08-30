/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.table.common.udb;

import alluxio.table.common.BaseConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * This represents a configuration of the UDB.
 */
public class UdbConfiguration extends BaseConfiguration<UdbProperty> {
  private static final Logger LOG = LoggerFactory.getLogger(UdbConfiguration.class);

  /**
   * Creates an instance.
   *
   * @param values the map of values
   */
  public UdbConfiguration(Map<String, String> values) {
    super(values);
  }
}
