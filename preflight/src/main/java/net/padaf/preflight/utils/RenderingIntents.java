/*******************************************************************************
 * Copyright 2010 Atos Worldline SAS
 * 
 * Licensed by Atos Worldline SAS under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * Atos Worldline SAS licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.padaf.preflight.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static net.padaf.preflight.ValidationConstants.*;

/**
 * This class contains a static list of RenderingIntent values to allow an easy
 * RenderingIntent value validation. Here is the content of the RenderingIntent
 * list :
 * <UL>
 * <li>Perceptual
 * <li>Saturation
 * <li>AbsoluteColorimetric
 * <li>RelativeColorimetric
 * </UL>
 */
public class RenderingIntents {
  private static List<String> RENDERING_INTENTS;

  static {
    ArrayList<String> al = new ArrayList<String>(4);
    al.add(RENDERING_INTENT_REL_COLOR);
    al.add(RENDERING_INTENT_ABS_COLOR);
    al.add(RENDERING_INTENT_PERCEPTUAL);
    al.add(RENDERING_INTENT_SATURATION);
    RENDERING_INTENTS = Collections.unmodifiableList(al);
  }

  public static boolean contains(Object riArg) {
    return RENDERING_INTENTS.contains(riArg);
  }
}