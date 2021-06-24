/*
 *  Copyright 2021 Curity AB
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.curity.identityserver.client.configuration

import android.net.Uri

/*
 * The fixed OAuth configuration that is sent in a dynamic client registration request
 */
object ApplicationConfig {
    val issuer: Uri = Uri.parse("https://e6c9830b3f3f.eu.ngrok.io/oauth/v2/oauth-anonymous")
    val redirectUri: Uri = Uri.parse("io.curity.client:/callback")
    val postLogoutRedirectUri: Uri = Uri.parse("io.curity.client:/logoutcallback")
    const val scope = "openid profile"
}
