/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InMage Azure V2 input to update replication protected item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
public class A2AUpdateReplicationProtectedItemInput extends UpdateReplicationProtectedItemProviderInput {
    /**
     * The target cloud service ARM Id (for V1).
     */
    @JsonProperty(value = "recoveryCloudServiceId")
    private String recoveryCloudServiceId;

    /**
     * The target resource group ARM Id (for V2).
     */
    @JsonProperty(value = "recoveryResourceGroupId")
    private String recoveryResourceGroupId;

    /**
     * Managed disk update details.
     */
    @JsonProperty(value = "managedDiskUpdateDetails")
    private List<A2AVmManagedDiskUpdateDetails> managedDiskUpdateDetails;

    /**
     * The boot diagnostic storage account.
     */
    @JsonProperty(value = "recoveryBootDiagStorageAccountId")
    private String recoveryBootDiagStorageAccountId;

    /**
     * The recovery os disk encryption information.
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /**
     * Get the target cloud service ARM Id (for V1).
     *
     * @return the recoveryCloudServiceId value
     */
    public String recoveryCloudServiceId() {
        return this.recoveryCloudServiceId;
    }

    /**
     * Set the target cloud service ARM Id (for V1).
     *
     * @param recoveryCloudServiceId the recoveryCloudServiceId value to set
     * @return the A2AUpdateReplicationProtectedItemInput object itself.
     */
    public A2AUpdateReplicationProtectedItemInput withRecoveryCloudServiceId(String recoveryCloudServiceId) {
        this.recoveryCloudServiceId = recoveryCloudServiceId;
        return this;
    }

    /**
     * Get the target resource group ARM Id (for V2).
     *
     * @return the recoveryResourceGroupId value
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the target resource group ARM Id (for V2).
     *
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set
     * @return the A2AUpdateReplicationProtectedItemInput object itself.
     */
    public A2AUpdateReplicationProtectedItemInput withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get managed disk update details.
     *
     * @return the managedDiskUpdateDetails value
     */
    public List<A2AVmManagedDiskUpdateDetails> managedDiskUpdateDetails() {
        return this.managedDiskUpdateDetails;
    }

    /**
     * Set managed disk update details.
     *
     * @param managedDiskUpdateDetails the managedDiskUpdateDetails value to set
     * @return the A2AUpdateReplicationProtectedItemInput object itself.
     */
    public A2AUpdateReplicationProtectedItemInput withManagedDiskUpdateDetails(List<A2AVmManagedDiskUpdateDetails> managedDiskUpdateDetails) {
        this.managedDiskUpdateDetails = managedDiskUpdateDetails;
        return this;
    }

    /**
     * Get the boot diagnostic storage account.
     *
     * @return the recoveryBootDiagStorageAccountId value
     */
    public String recoveryBootDiagStorageAccountId() {
        return this.recoveryBootDiagStorageAccountId;
    }

    /**
     * Set the boot diagnostic storage account.
     *
     * @param recoveryBootDiagStorageAccountId the recoveryBootDiagStorageAccountId value to set
     * @return the A2AUpdateReplicationProtectedItemInput object itself.
     */
    public A2AUpdateReplicationProtectedItemInput withRecoveryBootDiagStorageAccountId(String recoveryBootDiagStorageAccountId) {
        this.recoveryBootDiagStorageAccountId = recoveryBootDiagStorageAccountId;
        return this;
    }

    /**
     * Get the recovery os disk encryption information.
     *
     * @return the diskEncryptionInfo value
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the recovery os disk encryption information.
     *
     * @param diskEncryptionInfo the diskEncryptionInfo value to set
     * @return the A2AUpdateReplicationProtectedItemInput object itself.
     */
    public A2AUpdateReplicationProtectedItemInput withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

}