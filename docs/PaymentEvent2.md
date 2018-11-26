
# PaymentEvent2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.[CR][LF][CR][LF]Note[TAB]the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). |  [optional]
**to** | **String** | The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.[CR][LF][CR][LF]Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer). |  [optional]
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) |  | 
**forwardedAgent** | **String** | Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction. |  [optional]
**received** | **Boolean** | Indicates whether a payment has been received or not. | 



