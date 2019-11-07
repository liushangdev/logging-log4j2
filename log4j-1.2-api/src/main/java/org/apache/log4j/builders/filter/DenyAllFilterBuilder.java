/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.log4j.builders.filter;

import org.apache.log4j.Layout;
import org.apache.log4j.bridge.FilterWrapper;
import org.apache.log4j.bridge.LayoutWrapper;
import org.apache.log4j.builders.layout.LayoutBuilder;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.xml.XmlConfigurationFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.filter.DenyAllFilter;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.apache.logging.log4j.status.StatusLogger;
import org.w3c.dom.Element;

import static org.apache.log4j.builders.BuilderManager.CATEGORY;

/**
 * Build a Pattern Layout
 */
@Plugin(name = "org.apache.log4j.varia.DenyAllFilter", category = CATEGORY)
public class DenyAllFilterBuilder implements FilterBuilder {

    private static final Logger LOGGER = StatusLogger.getLogger();

    @Override
    public Filter parseFilter(Element filterElement, XmlConfigurationFactory factory) {
        return new FilterWrapper(DenyAllFilter.newBuilder().build());
    }
}
