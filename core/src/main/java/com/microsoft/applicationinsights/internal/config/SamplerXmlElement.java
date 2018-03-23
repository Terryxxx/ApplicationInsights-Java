/*
 * ApplicationInsights-Java
 * Copyright (c) Microsoft Corporation
 * All rights reserved.
 *
 * MIT License
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the ""Software""), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package com.microsoft.applicationinsights.internal.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by gupele on 11/2/2016.
 */
public class SamplerXmlElement {
    private FixedSamplerXmlElement fixedSamplerXmlElement;
    private AdaptiveSamplerXmlElement adaptiveSamplerXmlElement;

    public FixedSamplerXmlElement getFixedSamplerXmlElement() {
        return fixedSamplerXmlElement;
    }

    @XmlElement(name="Fixed")
    public void setFixedSamplerXmlElement(FixedSamplerXmlElement fixedSamplerXmlElement) {
        this.fixedSamplerXmlElement = fixedSamplerXmlElement;
    }

    public AdaptiveSamplerXmlElement getAdaptiveSamplerXmlElement() {
        return adaptiveSamplerXmlElement;
    }

    @XmlElement(name="Adaptive")
    public void setAdaptiveSamplerXmlElement(AdaptiveSamplerXmlElement adaptiveSamplerXmlElement) {
        this.adaptiveSamplerXmlElement = adaptiveSamplerXmlElement;
    }
}
