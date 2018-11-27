
# StatusDetails1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originator** | **String** | Party that issues the status. | 
**fundsAvailable** | **String** | Date and time at which the funds are available,  as reported in the ACSC status update. |  [optional]
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) |  | 
**forwardedAgent** | **String** | Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.[CR][LF]This element must be used in case the status is ACSP/000 or ACSP/001. |  [optional]
**confirmedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) |  | 
**foreignExchangeDetails** | [**ForeignExchangeTerms32**](ForeignExchangeTerms32.md) |  |  [optional]
**chargeAmount** | [**List&lt;ActiveOrHistoricCurrencyAndAmount&gt;**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money asked or paid for the charge. |  [optional]



