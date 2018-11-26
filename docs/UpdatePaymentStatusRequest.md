
# UpdatePaymentStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.[CR][LF][CR][LF]Note[TAB]the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). | 
**businessService** | **String** | Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.[CR][LF] To be used when there is a choice of processing services or processing service levels.[CR][LF]Example: 001 | 
**transactionIdentification** | **String** | Contains the unique end to end transaction reference (UETR). [CR][LF]Format is lowercase separated by hyphens. | 
**instructionIdentification** | **String** | Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.[LF][LF]Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction. | 
**paymentStatus** | [**PaymentStatusType1Choice**](PaymentStatusType1Choice.md) |  | 



