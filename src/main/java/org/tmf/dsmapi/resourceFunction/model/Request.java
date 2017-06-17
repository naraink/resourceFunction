/*
 * API Resource Function Provisioning and Lifecycle Management
 * API to provision,manage lifecyle of, configure and activate Resource Functions (Network Services in ETSI terminology that could be composed from physical or virtual network functions)
 *
 * OpenAPI spec version: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.tmf.dsmapi.resourceFunction.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Request
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
@Entity
public class Request   {
     @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id = null;
   
  @JsonProperty("method")
  private String method = null;

  @JsonProperty("to")
  @Column(name="REQ_TO")
  private String to = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("header")
  private List<RequestHeader> header = new ArrayList<RequestHeader>();

  public Request method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Request to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Request body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Request header(List<RequestHeader> header) {
    this.header = header;
    return this;
  }

  public Request addHeaderItem(RequestHeader headerItem) {
    this.header.add(headerItem);
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(required = true, value = "")
  public List<RequestHeader> getHeader() {
    return header;
  }

  public void setHeader(List<RequestHeader> header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request request = (Request) o;
    return Objects.equals(this.method, request.method) &&
        Objects.equals(this.to, request.to) &&
        Objects.equals(this.body, request.body) &&
        Objects.equals(this.header, request.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, to, body, header);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
