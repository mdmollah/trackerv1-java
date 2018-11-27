
# PaymentTransaction72

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionIdentification** | **String** | Contains the unique end to end transaction reference (UETR) of a payment. | 
**myInstitution** | **String** | Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details. | 
**role** | [**PaymentsPartyType2Code**](PaymentsPartyType2Code.md) |  | 
**eventTime** | **String** | Time determined by the Role that the entity defined in MyInstitution is playing in this transaction. | 
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) |  | 
**previousInstructingAgent** | **String** | Agent immediately prior to the instructing agent. |  [optional]
**agents** | [**List&lt;PaymentEvent2&gt;**](PaymentEvent2.md) | Identifies the agents currently participating in a transaction. | 
**creditorAgent** | **String** | Financial institution servicing an account for the creditor. |  [optional]
**initiationTime** | **String** | Date and Time at which the message enters the Gpi system. | 
**completionTime** | **String** | Time at which the Instructed Bank reports that the transaction has been completed. [CR][LF]Date and time based on the creation date of the status confirmation containing a final status ACSC. |  [optional]
**instructedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) |  | 
**lastUpdateTime** | **String** | Last date and time at which the status of this transaction was updated. | 



