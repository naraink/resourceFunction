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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;
import javax.ejb.Stateless;
import javax.persistence.CascadeType;
import static javax.persistence.CascadeType.REFRESH;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 * ResourceFunction
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
@Stateless
@Entity
public class ResourceFunction implements Serializable {

    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;

    @JsonProperty("href")
    @JsonInclude()
    @Transient
    private String href = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("role")
    private String role = null;

    @JsonProperty("location")
    @ManyToOne(cascade = CascadeType.MERGE)
    private ResourceFunctionLocation location = null;

    /**
     * List of the kinds of auto-modifications that are applied to a given
     * network service e.g what can be scaled
     */
    public enum AutoModificationEnum {
        SCALESTORAGE("scaleStorage"),
        SCALEUPINTERFACE("scaleUpInterface");

        private String value;

        AutoModificationEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AutoModificationEnum fromValue(String text) {
            for (AutoModificationEnum b : AutoModificationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("autoModification")
    private AutoModificationEnum autoModification = null;

    @JsonProperty("priority")
    private Long priority = null;

    /**
     * Provides the stage at which the resource function has been instantiated.
     * This is a compound state defined in TR255
     */
    public enum StateEnum {
        PLANNING("planning"),
        INSTALLING("installing"),
        OPERATING("operating"),
        RETIRING("retiring");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("state")
    private StateEnum state = null;

    @JsonProperty("subState")
    private String subState = null;

    @JsonProperty("schedule")
    private List<ScheduleRef> schedule = new ArrayList<ScheduleRef>();

    @JsonProperty("sap")
    private List<SAPRef> sap = new ArrayList<SAPRef>();

    @JsonProperty("resourceFunctionSpecification")
    private ResourceFunctionSpecification resourceFunctionSpecification = null;

    @JsonProperty("characteristic")
    private List<Characteristic> characteristic = new ArrayList<Characteristic>();

    @JsonProperty("feature")
    @OneToMany(cascade = {CascadeType.PERSIST})
    private List<Feature> feature = new ArrayList<Feature>();

    @JsonProperty("featureGroup")
    private List<FeatureGroup> featureGroup = new ArrayList<FeatureGroup>();

    @JsonProperty("supportingResourceFunction")
    private List<ResourceFunction> supportingResourceFunction = new ArrayList<ResourceFunction>();

    @JsonProperty("connectivity")
    private List<Connectivity> connectivity = new ArrayList<Connectivity>();

    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

    public ResourceFunction id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Identifier of the network service instance. Required to be unique. Used
     * in URIs as the identifier of the service (for modify or delete use cases)
     *
     * @return id
  *
     */
    @ApiModelProperty(example = "17898", value = "Identifier of the network service instance. Required to be unique. Used in URIs as the identifier of the service (for modify or delete use cases)")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ResourceFunction href(String href) {
        this.href = href;
        return this;
    }

    /**
     * URI for the Resource Function. This is set by the provider of the API
     *
     * @return href
  *
     */
    @ApiModelProperty(example = "http://serverlocation:port/resourceFunction/17898", value = "URI for the Resource Function. This is set by the provider of the API")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ResourceFunction name(String name) {
        this.name = name;
        return this;
    }

    /**
     * User friendly moniker for the Resource Function
     *
     * @return name
  *
     */
    @ApiModelProperty(example = "CDN Cluster", value = "User friendly moniker for the Resource Function")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceFunction description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description of the Resource Function (What does it provide)
     *
     * @return description
  *
     */
    @ApiModelProperty(example = "CDN capability spread across multiple geographies", value = "A description of the Resource Function (What does it provide)")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ResourceFunction type(String type) {
        this.type = type;
        return this;
    }

    /**
     * A type of the Resource Function as specified by the provider of the API
     *
     * @return type
  *
     */
    @ApiModelProperty(example = "Content Delivery", value = "A type of the Resource Function as specified by the provider of the API")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceFunction version(String version) {
        this.version = version;
        return this;
    }

    /**
     * A version of the Resource Function as specified by the provider of the
     * API
     *
     * @return version
  *
     */
    @ApiModelProperty(example = "1.2", value = "A version of the Resource Function as specified by the provider of the API")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ResourceFunction role(String role) {
        this.role = role;
        return this;
    }

    /**
     * Role of the Resource Function. Used when Resource Function is a component
     * of a composite Resource Function and the exact role of the service within
     * the composite is not clear from descriptor/location.
     *
     * @return role
  *
     */
    @ApiModelProperty(example = "Backup Media Store", value = "Role of the Resource Function. Used when Resource Function is a component of a composite Resource Function and the exact role of the service within the composite is not clear from descriptor/location.")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ResourceFunction location(ResourceFunctionLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     *
     * @return location
  *
     */
    @ApiModelProperty(value = "")
    public ResourceFunctionLocation getLocation() {
        return location;
    }

    public void setLocation(ResourceFunctionLocation location) {
        this.location = location;
    }

    public ResourceFunction autoModification(AutoModificationEnum autoModification) {
        this.autoModification = autoModification;
        return this;
    }

    /**
     * List of the kinds of auto-modifications that are applied to a given
     * network service e.g what can be scaled
     *
     * @return autoModification
  *
     */
    @ApiModelProperty(value = "List of the kinds of auto-modifications that are applied to a given network service e.g what can be scaled")
    public AutoModificationEnum getAutoModification() {
        return autoModification;
    }

    public void setAutoModification(AutoModificationEnum autoModification) {
        this.autoModification = autoModification;
    }

    public ResourceFunction priority(Long priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Priority of the Resource Function. Decides what happens in a contention
     * scenario
     *
     * @return priority
  *
     */
    @ApiModelProperty(example = "2", value = "Priority of the Resource Function. Decides what happens in a contention scenario")
    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public ResourceFunction state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Provides the stage at which the resource function has been instantiated.
     * This is a compound state defined in TR255
     *
     * @return state
  *
     */
    @ApiModelProperty(value = "Provides the stage at which the resource function has been instantiated. This is a compound state defined in TR255")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ResourceFunction subState(String subState) {
        this.subState = subState;
        return this;
    }

    /**
     * Provides the usage sub-state information for the resource function. The
     * value is dependent on the value of State. Please refer to section 3.2.7
     * of TR255 for details.
     *
     * @return subState
  *
     */
    @ApiModelProperty(value = "Provides the usage sub-state information for the resource function. The value is dependent on the value of State. Please refer to section 3.2.7 of TR255 for details.")
    public String getSubState() {
        return subState;
    }

    public void setSubState(String subState) {
        this.subState = subState;
    }

    public ResourceFunction schedule(List<ScheduleRef> schedule) {
        this.schedule = schedule;
        return this;
    }

    public ResourceFunction addScheduleItem(ScheduleRef scheduleItem) {
        this.schedule.add(scheduleItem);
        return this;
    }

    /**
     * This is a reference to a schedule. Allows consumers to schedule
     * modifications to the service at certain times
     *
     * @return schedule
  *
     */
    @ApiModelProperty(value = " This is a reference to a schedule. Allows consumers to schedule modifications to the service at certain times")
    public List<ScheduleRef> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleRef> schedule) {
        this.schedule = schedule;
    }

    public ResourceFunction sap(List<SAPRef> sap) {
        this.sap = sap;
        return this;
    }

    public ResourceFunction addSapItem(SAPRef sapItem) {
        this.sap.add(sapItem);
        return this;
    }

    /**
     * The service access points available on the resource function
     *
     * @return sap
  *
     */
    @ApiModelProperty(value = " The service access points available on the resource function ")
    public List<SAPRef> getSap() {
        return sap;
    }

    public void setSap(List<SAPRef> sap) {
        this.sap = sap;
    }

    public ResourceFunction resourceFunctionSpecification(ResourceFunctionSpecification resourceFunctionSpecification) {
        this.resourceFunctionSpecification = resourceFunctionSpecification;
        return this;
    }

    /**
     * Pointer to the resource specification that will be used to create this
     * resource function
     *
     * @return resourceFunctionSpecification
  *
     */
    @ApiModelProperty(required = true, value = " Pointer to the resource specification that will be used to create this resource function ")
    public ResourceFunctionSpecification getResourceFunctionSpecification() {
        return resourceFunctionSpecification;
    }

    public void setResourceFunctionSpecification(ResourceFunctionSpecification resourceFunctionSpecification) {
        this.resourceFunctionSpecification = resourceFunctionSpecification;
    }

    public ResourceFunction characteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
        return this;
    }

    public ResourceFunction addCharacteristicItem(Characteristic characteristicItem) {
        this.characteristic.add(characteristicItem);
        return this;
    }

    /**
     * List of resource characteristics. This is based on the resource
     * specification
     *
     * @return characteristic
  *
     */
    @ApiModelProperty(value = " List of resource characteristics. This is based on the resource specification ")
    public List<Characteristic> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    public ResourceFunction feature(List<Feature> feature) {
        this.feature = feature;
        return this;
    }

    public ResourceFunction addFeatureItem(Feature featureItem) {
        this.feature.add(featureItem);
        return this;
    }

    /**
     * List of features requested. This is based on the resource specification
     *
     * @return feature
  *
     */
    @ApiModelProperty(value = " List of features requested. This is based on the resource specification ")
    public List<Feature> getFeature() {
        return feature;
    }

    public void setFeature(List<Feature> feature) {
        this.feature = feature;
    }

    public ResourceFunction featureGroup(List<FeatureGroup> featureGroup) {
        this.featureGroup = featureGroup;
        return this;
    }

    public ResourceFunction addFeatureGroupItem(FeatureGroup featureGroupItem) {
        this.featureGroup.add(featureGroupItem);
        return this;
    }

    /**
     * List of feature groups. This is based on the resource specification
     *
     * @return featureGroup
  *
     */
    @ApiModelProperty(value = " List of feature groups. This is based on the resource specification ")
    public List<FeatureGroup> getFeatureGroup() {
        return featureGroup;
    }

    public void setFeatureGroup(List<FeatureGroup> featureGroup) {
        this.featureGroup = featureGroup;
    }

    public ResourceFunction supportingResourceFunction(List<ResourceFunction> supportingResourceFunction) {
        this.supportingResourceFunction = supportingResourceFunction;
        return this;
    }

    public ResourceFunction addSupportingResourceFunctionItem(ResourceFunction supportingResourceFunctionItem) {
        this.supportingResourceFunction.add(supportingResourceFunctionItem);
        return this;
    }

    /**
     * This is a list of composite and atomic resource functions from which this
     * resource function is composed. These are all the vertices of the graph.
     *
     * @return supportingResourceFunction
  *
     */
    @ApiModelProperty(value = " This is a list of composite and atomic resource functions from which this resource function is composed. These are all the vertices of the graph. ")
    public List<ResourceFunction> getSupportingResourceFunction() {
        return supportingResourceFunction;
    }

    public void setSupportingResourceFunction(List<ResourceFunction> supportingResourceFunction) {
        this.supportingResourceFunction = supportingResourceFunction;
    }

    public ResourceFunction connectivity(List<Connectivity> connectivity) {
        this.connectivity = connectivity;
        return this;
    }

    public ResourceFunction addConnectivityItem(Connectivity connectivityItem) {
        this.connectivity.add(connectivityItem);
        return this;
    }

    /**
     * These are the edges of the graph and provide details of how the resource
     * functions listed in supportingResourceFunction are connected together
     *
     * @return connectivity
  *
     */
    @ApiModelProperty(value = " These are the edges of the graph and provide details of how the resource functions listed in supportingResourceFunction are connected together ")
    public List<Connectivity> getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(List<Connectivity> connectivity) {
        this.connectivity = connectivity;
    }

    public ResourceFunction relatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public ResourceFunction addRelatedPartyItem(RelatedParty relatedPartyItem) {
        this.relatedParty.add(relatedPartyItem);
        return this;
    }

    /**
     * List of party objects related to this resource function. This can be used
     * to (for example) indicate the consumer that owns the RF or a management
     * entity responsible the RF.
     *
     * @return relatedParty
  *
     */
    @ApiModelProperty(value = " List of party objects related to this resource function. This can be used to (for example) indicate the consumer that owns the RF or a management entity responsible the RF. ")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceFunction resourceFunction = (ResourceFunction) o;
        return Objects.equals(this.id, resourceFunction.id)
                && Objects.equals(this.href, resourceFunction.href)
                && Objects.equals(this.name, resourceFunction.name)
                && Objects.equals(this.description, resourceFunction.description)
                && Objects.equals(this.type, resourceFunction.type)
                && Objects.equals(this.version, resourceFunction.version)
                && Objects.equals(this.role, resourceFunction.role)
                && Objects.equals(this.location, resourceFunction.location)
                && Objects.equals(this.autoModification, resourceFunction.autoModification)
                && Objects.equals(this.priority, resourceFunction.priority)
                && Objects.equals(this.state, resourceFunction.state)
                && Objects.equals(this.subState, resourceFunction.subState)
                && Objects.equals(this.schedule, resourceFunction.schedule)
                && Objects.equals(this.sap, resourceFunction.sap)
                && Objects.equals(this.resourceFunctionSpecification, resourceFunction.resourceFunctionSpecification)
                && Objects.equals(this.characteristic, resourceFunction.characteristic)
                && Objects.equals(this.feature, resourceFunction.feature)
                && Objects.equals(this.featureGroup, resourceFunction.featureGroup)
                && Objects.equals(this.supportingResourceFunction, resourceFunction.supportingResourceFunction)
                && Objects.equals(this.connectivity, resourceFunction.connectivity)
                && Objects.equals(this.relatedParty, resourceFunction.relatedParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, name, description, type, version, role, location, autoModification, priority, state, subState, schedule, sap, resourceFunctionSpecification, characteristic, feature, featureGroup, supportingResourceFunction, connectivity, relatedParty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFunction {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    autoModification: ").append(toIndentedString(autoModification)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subState: ").append(toIndentedString(subState)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    sap: ").append(toIndentedString(sap)).append("\n");
        sb.append("    resourceFunctionSpecification: ").append(toIndentedString(resourceFunctionSpecification)).append("\n");
        sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    featureGroup: ").append(toIndentedString(featureGroup)).append("\n");
        sb.append("    supportingResourceFunction: ").append(toIndentedString(supportingResourceFunction)).append("\n");
        sb.append("    connectivity: ").append(toIndentedString(connectivity)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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