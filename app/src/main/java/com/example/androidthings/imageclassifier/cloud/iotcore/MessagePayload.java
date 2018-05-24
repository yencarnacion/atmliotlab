/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androidthings.imageclassifier.cloud.iotcore;


import org.json.JSONException;
import org.json.JSONObject;


/**
 * This class handles the serialization of the SensorData objects into a String
 */
public class MessagePayload {

    /**
     * Serialize a List of SensorData objects into a JSON string, for sending to the cloud
     * @param gcsFilePath GCS File path
     * @return JSON String
     */
    public static String createMessagePayload(String gcsFilePath, String label) {
        try {
            JSONObject messagePayload = new JSONObject();
            messagePayload.put("filePath", gcsFilePath);
            messagePayload.put("label", label);
            return messagePayload.toString();
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid message");
        }
    }
}
