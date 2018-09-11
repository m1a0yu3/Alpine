/*
 * This file is part of Alpine.
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
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package alpine.event.framework;

import alpine.logging.Logger;

/**
 * This class simply creates a log entry for any uncaught exceptions that may arise
 * during the execution of various asynchronous threads.
 *
 * @author Steve Springett
 * @since 1.3.0
 */
public class LoggableUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    private static final Logger LOGGER = Logger.getLogger(LoggableUncaughtExceptionHandler.class);

    public void uncaughtException(Thread myThread, Throwable e) {
        LOGGER.error("An unknown error occurred in an asynchronous event or notification thread", e);
    }

}
