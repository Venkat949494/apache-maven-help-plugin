/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

String content = new File( basedir, "build.log" ).text

// comments in the same line
assert content.contains( "<groupId>org.apache.maven.its.help</groupId>  <!-- org.apache.maven.its.help:test:1.0-SNAPSHOT," )
assert content.contains( "<url>https://maven.apache.org/plugins/test/</url>  <!-- org.apache.maven.plugins:maven-plugins:33, line 37 -->" )
