
# GetPaymentTransactionsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**myInstitution** | **List&lt;String&gt;** | Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details. | 
**timeWindow** | [**DateTimePeriodDetails**](DateTimePeriodDetails.md) |  | 
**agent** | [**List&lt;AgentType1&gt;**](AgentType1.md) | Identifies agent(s) involved in a payment transaction. |  [optional]
**location** | [**Location1Code**](Location1Code.md) |  |  [optional]
**transactionStatus** | [**List&lt;PaymentStatus3&gt;**](PaymentStatus3.md) | Specifies the status of a transaction, in a coded form. |  [optional]
**amount** | [**AmountType1**](AmountType1.md) |  |  [optional]
**event** | [**PaymentTransactionState1Code**](PaymentTransactionState1Code.md) |  | 
**maximumNumber** | **String** | Number of objects represented as an integer. | 
**more** | **String** | Contains the token to get the next set of responses. |  [optional]



