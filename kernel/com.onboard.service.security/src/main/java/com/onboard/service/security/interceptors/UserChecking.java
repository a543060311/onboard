/*******************************************************************************
 * Copyright [2015] [Onboard team of SERC, Peking University]
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
 *******************************************************************************/
package com.onboard.service.security.interceptors;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 判断user是否存在，以及user是否属于公司
 * 
 * @author yewei
 * 
 */
@Service("userCheckingBean")
public interface UserChecking extends HandlerInterceptor {

}