/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.au;

import org.apache.commons.cli.*;
import org.apache.commons.lang3.text.WordUtils;
//import org.apache.commons.lang.WordUtils;
//public class App {
//    public String getGreeting() {
//        return "Hello World!";
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
//    }
//}
/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */



/**
 * Simple example to show how easy it is to retrieve transitive libs with ivy !!!
 */
public final class App {
    public static void main(String[] args) throws Exception {
        Option msg = Option.builder("m")
                .longOpt("message")
                .hasArg()
                .desc("the message to capitalize")
                .build();
        Options options = new Options();
        options.addOption(msg);

        CommandLineParser parser = new DefaultParser();
        CommandLine line = parser.parse(options, args);

        String  message = line.getOptionValue("m", "Hello Ivy!");
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName()
                + " : " + WordUtils.capitalizeFully(message));
    }

    App() {
    }

    public Object getGreeting(String inp, String args[]) throws ParseException {
        Option msg = Option.builder("m")
                .longOpt("message")
                .hasArg()
                .desc("the message to capitalize")
                .build();
        Options options = new Options();
        options.addOption(msg);

        CommandLineParser parser = new DefaultParser();
        CommandLine line = parser.parse(options,args);

        String  message = line.getOptionValue("dkwj",inp);
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName()
                + " : " + WordUtils.capitalizeFully(message));
        return null;
    }}
