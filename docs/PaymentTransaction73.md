
# PaymentTransaction73

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionIdentification** | **String** | Contains the unique end to end transaction reference (UETR) of a payment. | 
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) |  | 
**initiationTime** | **String** | Date and Time at which the message enters the GPII system. | 
**completionTime** | **String** | Time at which the Instructed Bank reports that the transaction has been completed. [CR][LF]Date and time based on the creation date of the status confirmation containing a final status ACSC |  [optional]
**lastUpdateTime** | **String** | Last date and time at which the status of this transaction was updated. | 
**paymentEvent** | [**List&lt;PaymentEvent1&gt;**](PaymentEvent1.md) | This groups the information of an event, i.e., of a payment message or status confirmation update. It is repeated as many times as there are events to be returned. | 



