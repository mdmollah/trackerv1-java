
# PaymentEvent1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkReference** | **String** | Reference assigned by the network when sending the payment. | 
**messageNameIdentification** | **String** | Specifies the original message name identifier to which the message refers. | 
**businessService** | **String** | Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.[CR][LF] To be used when there is a choice of processing services or processing service levels.[CR][LF]Example: 001 | 
**valid** | **Boolean** | Indicates if a payment is consistent (YES) or not (NO). | 
**invalidityReason** | **String** | Contains the additional information in case the event is not a valid component of a payment transaction. |  [optional]
**invalidityDescription** | **String** | Contains a textual description as to why the event is not a valid component of a payments transaction. |  [optional]
**senderReference** | **String** | Identification assigned by the sender of the Message.[CR][LF]For MT format this is the MUR. |  [optional]
**instructionIdentification** | **String** | Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.[LF][LF]Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction. | 
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) |  |  [optional]
**forwardedAgent** | **String** | Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction. |  [optional]
**fundsAvailable** | **String** | Date and time at which the funds are available,  as reported in the ACSC status update.[CR][LF]Must only be used when TransactionStatus is \&quot;ACSC\&quot;. |  [optional]
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.[CR][LF][CR][LF]Note[TAB]the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). |  [optional]
**to** | **String** | The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.[CR][LF][CR][LF]Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer). |  [optional]
**originator** | **String** | Party that issues the status. |  [optional]
**creditorAgent** | **String** | Financial institution servicing an account for the creditor. |  [optional]
**previousInstructingAgent** | **String** | Agent immediately prior to the instructing agent. |  [optional]
**senderAcknowledgementReceipt** | **String** | Date and time at which the sender acknowledged receipt of the message. | 
**receivedDate** | **String** | Date and time at which the message was acknowledged by the receiver. |  [optional]
**instructedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) |  |  [optional]
**confirmedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) |  |  [optional]
**interbankSettlementAmount** | [**ActiveCurrencyAndAmount**](ActiveCurrencyAndAmount.md) |  |  [optional]
**interbankSettlementDate** | **String** | Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due. |  [optional]
**chargeBearer** | [**ChargeBearerType3Code**](ChargeBearerType3Code.md) |  |  [optional]
**chargeAmount** | [**List&lt;ActiveOrHistoricCurrencyAndAmount&gt;**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money asked or paid for the charge. |  [optional]
**foreignExchangeDetails** | [**ForeignExchangeTerms32**](ForeignExchangeTerms32.md) |  |  [optional]
**updatePayment** | **String** | Implements the correlation between a payment message and a status update on it. [CR][LF]Contains the network reference of the payment for which the status confirmation was applicable. |  [optional]
**duplicateMessageReference** | **String** | Network reference of the Payment that is the original recorded Payment. |  [optional]
**copiedBusinessService** | **String** | Specifies the copied business service of the market infrastructure. |  [optional]
**lastUpdateTime** | **String** | Last date and time at which the status of this Payment event was updated. | 



