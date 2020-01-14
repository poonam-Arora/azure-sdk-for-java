/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.servicebus.v2017_04_01.implementation.SBQueueInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2017_04_01.implementation.ServiceBusManager;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * Type representing SBQueue.
 */
public interface SBQueue extends HasInner<SBQueueInner>, Indexable, Refreshable<SBQueue>, Updatable<SBQueue.Update>, HasManager<ServiceBusManager> {
    /**
     * @return the accessedAt value.
     */
    DateTime accessedAt();

    /**
     * @return the autoDeleteOnIdle value.
     */
    Period autoDeleteOnIdle();

    /**
     * @return the countDetails value.
     */
    MessageCountDetails countDetails();

    /**
     * @return the createdAt value.
     */
    DateTime createdAt();

    /**
     * @return the deadLetteringOnMessageExpiration value.
     */
    Boolean deadLetteringOnMessageExpiration();

    /**
     * @return the defaultMessageTimeToLive value.
     */
    Period defaultMessageTimeToLive();

    /**
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    Period duplicateDetectionHistoryTimeWindow();

    /**
     * @return the enableBatchedOperations value.
     */
    Boolean enableBatchedOperations();

    /**
     * @return the enableExpress value.
     */
    Boolean enableExpress();

    /**
     * @return the enablePartitioning value.
     */
    Boolean enablePartitioning();

    /**
     * @return the forwardDeadLetteredMessagesTo value.
     */
    String forwardDeadLetteredMessagesTo();

    /**
     * @return the forwardTo value.
     */
    String forwardTo();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lockDuration value.
     */
    Period lockDuration();

    /**
     * @return the maxDeliveryCount value.
     */
    Integer maxDeliveryCount();

    /**
     * @return the maxSizeInMegabytes value.
     */
    Integer maxSizeInMegabytes();

    /**
     * @return the messageCount value.
     */
    Long messageCount();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the requiresDuplicateDetection value.
     */
    Boolean requiresDuplicateDetection();

    /**
     * @return the requiresSession value.
     */
    Boolean requiresSession();

    /**
     * @return the sizeInBytes value.
     */
    Long sizeInBytes();

    /**
     * @return the status value.
     */
    EntityStatus status();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the updatedAt value.
     */
    DateTime updatedAt();

    /**
     * The entirety of the SBQueue definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SBQueue definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SBQueue definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the sbqueue definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param namespaceName The namespace name
            * @return the next definition stage
            */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the sbqueue definition allowing to specify AutoDeleteOnIdle.
         */
        interface WithAutoDeleteOnIdle {
            /**
             * Specifies autoDeleteOnIdle.
             * @param autoDeleteOnIdle ISO 8061 timeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes
             * @return the next definition stage
             */
            WithCreate withAutoDeleteOnIdle(Period autoDeleteOnIdle);
        }

        /**
         * The stage of the sbqueue definition allowing to specify DeadLetteringOnMessageExpiration.
         */
        interface WithDeadLetteringOnMessageExpiration {
            /**
             * Specifies deadLetteringOnMessageExpiration.
             * @param deadLetteringOnMessageExpiration A value that indicates whether this queue has dead letter support when a message expires
             * @return the next definition stage
             */
            WithCreate withDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration);
        }

        /**
         * The stage of the sbqueue definition allowing to specify DefaultMessageTimeToLive.
         */
        interface WithDefaultMessageTimeToLive {
            /**
             * Specifies defaultMessageTimeToLive.
             * @param defaultMessageTimeToLive ISO 8601 default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself
             * @return the next definition stage
             */
            WithCreate withDefaultMessageTimeToLive(Period defaultMessageTimeToLive);
        }

        /**
         * The stage of the sbqueue definition allowing to specify DuplicateDetectionHistoryTimeWindow.
         */
        interface WithDuplicateDetectionHistoryTimeWindow {
            /**
             * Specifies duplicateDetectionHistoryTimeWindow.
             * @param duplicateDetectionHistoryTimeWindow ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes
             * @return the next definition stage
             */
            WithCreate withDuplicateDetectionHistoryTimeWindow(Period duplicateDetectionHistoryTimeWindow);
        }

        /**
         * The stage of the sbqueue definition allowing to specify EnableBatchedOperations.
         */
        interface WithEnableBatchedOperations {
            /**
             * Specifies enableBatchedOperations.
             * @param enableBatchedOperations Value that indicates whether server-side batched operations are enabled
             * @return the next definition stage
             */
            WithCreate withEnableBatchedOperations(Boolean enableBatchedOperations);
        }

        /**
         * The stage of the sbqueue definition allowing to specify EnableExpress.
         */
        interface WithEnableExpress {
            /**
             * Specifies enableExpress.
             * @param enableExpress A value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage
             * @return the next definition stage
             */
            WithCreate withEnableExpress(Boolean enableExpress);
        }

        /**
         * The stage of the sbqueue definition allowing to specify EnablePartitioning.
         */
        interface WithEnablePartitioning {
            /**
             * Specifies enablePartitioning.
             * @param enablePartitioning A value that indicates whether the queue is to be partitioned across multiple message brokers
             * @return the next definition stage
             */
            WithCreate withEnablePartitioning(Boolean enablePartitioning);
        }

        /**
         * The stage of the sbqueue definition allowing to specify ForwardDeadLetteredMessagesTo.
         */
        interface WithForwardDeadLetteredMessagesTo {
            /**
             * Specifies forwardDeadLetteredMessagesTo.
             * @param forwardDeadLetteredMessagesTo Queue/Topic name to forward the Dead Letter message
             * @return the next definition stage
             */
            WithCreate withForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo);
        }

        /**
         * The stage of the sbqueue definition allowing to specify ForwardTo.
         */
        interface WithForwardTo {
            /**
             * Specifies forwardTo.
             * @param forwardTo Queue/Topic name to forward the messages
             * @return the next definition stage
             */
            WithCreate withForwardTo(String forwardTo);
        }

        /**
         * The stage of the sbqueue definition allowing to specify LockDuration.
         */
        interface WithLockDuration {
            /**
             * Specifies lockDuration.
             * @param lockDuration ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute
             * @return the next definition stage
             */
            WithCreate withLockDuration(Period lockDuration);
        }

        /**
         * The stage of the sbqueue definition allowing to specify MaxDeliveryCount.
         */
        interface WithMaxDeliveryCount {
            /**
             * Specifies maxDeliveryCount.
             * @param maxDeliveryCount The maximum delivery count. A message is automatically deadlettered after this number of deliveries. default value is 10
             * @return the next definition stage
             */
            WithCreate withMaxDeliveryCount(Integer maxDeliveryCount);
        }

        /**
         * The stage of the sbqueue definition allowing to specify MaxSizeInMegabytes.
         */
        interface WithMaxSizeInMegabytes {
            /**
             * Specifies maxSizeInMegabytes.
             * @param maxSizeInMegabytes The maximum size of the queue in megabytes, which is the size of memory allocated for the queue. Default is 1024
             * @return the next definition stage
             */
            WithCreate withMaxSizeInMegabytes(Integer maxSizeInMegabytes);
        }

        /**
         * The stage of the sbqueue definition allowing to specify RequiresDuplicateDetection.
         */
        interface WithRequiresDuplicateDetection {
            /**
             * Specifies requiresDuplicateDetection.
             * @param requiresDuplicateDetection A value indicating if this queue requires duplicate detection
             * @return the next definition stage
             */
            WithCreate withRequiresDuplicateDetection(Boolean requiresDuplicateDetection);
        }

        /**
         * The stage of the sbqueue definition allowing to specify RequiresSession.
         */
        interface WithRequiresSession {
            /**
             * Specifies requiresSession.
             * @param requiresSession A value that indicates whether the queue supports the concept of sessions
             * @return the next definition stage
             */
            WithCreate withRequiresSession(Boolean requiresSession);
        }

        /**
         * The stage of the sbqueue definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status Enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'
             * @return the next definition stage
             */
            WithCreate withStatus(EntityStatus status);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SBQueue>, DefinitionStages.WithAutoDeleteOnIdle, DefinitionStages.WithDeadLetteringOnMessageExpiration, DefinitionStages.WithDefaultMessageTimeToLive, DefinitionStages.WithDuplicateDetectionHistoryTimeWindow, DefinitionStages.WithEnableBatchedOperations, DefinitionStages.WithEnableExpress, DefinitionStages.WithEnablePartitioning, DefinitionStages.WithForwardDeadLetteredMessagesTo, DefinitionStages.WithForwardTo, DefinitionStages.WithLockDuration, DefinitionStages.WithMaxDeliveryCount, DefinitionStages.WithMaxSizeInMegabytes, DefinitionStages.WithRequiresDuplicateDetection, DefinitionStages.WithRequiresSession, DefinitionStages.WithStatus {
        }
    }
    /**
     * The template for a SBQueue update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SBQueue>, UpdateStages.WithAutoDeleteOnIdle, UpdateStages.WithDeadLetteringOnMessageExpiration, UpdateStages.WithDefaultMessageTimeToLive, UpdateStages.WithDuplicateDetectionHistoryTimeWindow, UpdateStages.WithEnableBatchedOperations, UpdateStages.WithEnableExpress, UpdateStages.WithEnablePartitioning, UpdateStages.WithForwardDeadLetteredMessagesTo, UpdateStages.WithForwardTo, UpdateStages.WithLockDuration, UpdateStages.WithMaxDeliveryCount, UpdateStages.WithMaxSizeInMegabytes, UpdateStages.WithRequiresDuplicateDetection, UpdateStages.WithRequiresSession, UpdateStages.WithStatus {
    }

    /**
     * Grouping of SBQueue update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sbqueue update allowing to specify AutoDeleteOnIdle.
         */
        interface WithAutoDeleteOnIdle {
            /**
             * Specifies autoDeleteOnIdle.
             * @param autoDeleteOnIdle ISO 8061 timeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes
             * @return the next update stage
             */
            Update withAutoDeleteOnIdle(Period autoDeleteOnIdle);
        }

        /**
         * The stage of the sbqueue update allowing to specify DeadLetteringOnMessageExpiration.
         */
        interface WithDeadLetteringOnMessageExpiration {
            /**
             * Specifies deadLetteringOnMessageExpiration.
             * @param deadLetteringOnMessageExpiration A value that indicates whether this queue has dead letter support when a message expires
             * @return the next update stage
             */
            Update withDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration);
        }

        /**
         * The stage of the sbqueue update allowing to specify DefaultMessageTimeToLive.
         */
        interface WithDefaultMessageTimeToLive {
            /**
             * Specifies defaultMessageTimeToLive.
             * @param defaultMessageTimeToLive ISO 8601 default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself
             * @return the next update stage
             */
            Update withDefaultMessageTimeToLive(Period defaultMessageTimeToLive);
        }

        /**
         * The stage of the sbqueue update allowing to specify DuplicateDetectionHistoryTimeWindow.
         */
        interface WithDuplicateDetectionHistoryTimeWindow {
            /**
             * Specifies duplicateDetectionHistoryTimeWindow.
             * @param duplicateDetectionHistoryTimeWindow ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes
             * @return the next update stage
             */
            Update withDuplicateDetectionHistoryTimeWindow(Period duplicateDetectionHistoryTimeWindow);
        }

        /**
         * The stage of the sbqueue update allowing to specify EnableBatchedOperations.
         */
        interface WithEnableBatchedOperations {
            /**
             * Specifies enableBatchedOperations.
             * @param enableBatchedOperations Value that indicates whether server-side batched operations are enabled
             * @return the next update stage
             */
            Update withEnableBatchedOperations(Boolean enableBatchedOperations);
        }

        /**
         * The stage of the sbqueue update allowing to specify EnableExpress.
         */
        interface WithEnableExpress {
            /**
             * Specifies enableExpress.
             * @param enableExpress A value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage
             * @return the next update stage
             */
            Update withEnableExpress(Boolean enableExpress);
        }

        /**
         * The stage of the sbqueue update allowing to specify EnablePartitioning.
         */
        interface WithEnablePartitioning {
            /**
             * Specifies enablePartitioning.
             * @param enablePartitioning A value that indicates whether the queue is to be partitioned across multiple message brokers
             * @return the next update stage
             */
            Update withEnablePartitioning(Boolean enablePartitioning);
        }

        /**
         * The stage of the sbqueue update allowing to specify ForwardDeadLetteredMessagesTo.
         */
        interface WithForwardDeadLetteredMessagesTo {
            /**
             * Specifies forwardDeadLetteredMessagesTo.
             * @param forwardDeadLetteredMessagesTo Queue/Topic name to forward the Dead Letter message
             * @return the next update stage
             */
            Update withForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo);
        }

        /**
         * The stage of the sbqueue update allowing to specify ForwardTo.
         */
        interface WithForwardTo {
            /**
             * Specifies forwardTo.
             * @param forwardTo Queue/Topic name to forward the messages
             * @return the next update stage
             */
            Update withForwardTo(String forwardTo);
        }

        /**
         * The stage of the sbqueue update allowing to specify LockDuration.
         */
        interface WithLockDuration {
            /**
             * Specifies lockDuration.
             * @param lockDuration ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute
             * @return the next update stage
             */
            Update withLockDuration(Period lockDuration);
        }

        /**
         * The stage of the sbqueue update allowing to specify MaxDeliveryCount.
         */
        interface WithMaxDeliveryCount {
            /**
             * Specifies maxDeliveryCount.
             * @param maxDeliveryCount The maximum delivery count. A message is automatically deadlettered after this number of deliveries. default value is 10
             * @return the next update stage
             */
            Update withMaxDeliveryCount(Integer maxDeliveryCount);
        }

        /**
         * The stage of the sbqueue update allowing to specify MaxSizeInMegabytes.
         */
        interface WithMaxSizeInMegabytes {
            /**
             * Specifies maxSizeInMegabytes.
             * @param maxSizeInMegabytes The maximum size of the queue in megabytes, which is the size of memory allocated for the queue. Default is 1024
             * @return the next update stage
             */
            Update withMaxSizeInMegabytes(Integer maxSizeInMegabytes);
        }

        /**
         * The stage of the sbqueue update allowing to specify RequiresDuplicateDetection.
         */
        interface WithRequiresDuplicateDetection {
            /**
             * Specifies requiresDuplicateDetection.
             * @param requiresDuplicateDetection A value indicating if this queue requires duplicate detection
             * @return the next update stage
             */
            Update withRequiresDuplicateDetection(Boolean requiresDuplicateDetection);
        }

        /**
         * The stage of the sbqueue update allowing to specify RequiresSession.
         */
        interface WithRequiresSession {
            /**
             * Specifies requiresSession.
             * @param requiresSession A value that indicates whether the queue supports the concept of sessions
             * @return the next update stage
             */
            Update withRequiresSession(Boolean requiresSession);
        }

        /**
         * The stage of the sbqueue update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status Enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'
             * @return the next update stage
             */
            Update withStatus(EntityStatus status);
        }

    }
}