{"id":"ca7b33e0-eca9-4e2a-8574-4b22471fd4e2","name":"BuyBread.Managewarehouse-taskform.frm","model":{"processName":"Manage warehouse","processId":"BuyBread.Managewarehouse","properties":[{"name":"order","typeInfo":{"type":"OBJECT","className":"cz.lipovcan.buybread.Order","multiple":false},"metaData":{"entries":[]}},{"name":"stock","typeInfo":{"type":"OBJECT","className":"cz.lipovcan.buybread.Warehouse_Database","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"nestedForm":"6fdb87b5-7d43-4e64-bcb1-646309dd51e8","container":"FIELD_SET","id":"field_1343755670160264E12","name":"order","label":"Order","required":false,"readOnly":false,"validateOnChange":true,"binding":"order","standaloneClassName":"cz.lipovcan.buybread.Order","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"nestedForm":"fbfce514-d558-4439-bb91-ada2a6c4e3b8","container":"FIELD_SET","id":"field_315276296882282E11","name":"stock","label":"Stock","required":false,"readOnly":false,"validateOnChange":true,"binding":"stock","standaloneClassName":"cz.lipovcan.buybread.Warehouse_Database","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"}],"layoutTemplate":{"version":2,"style":"FLUID","layoutProperties":{},"rows":[{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_1343755670160264E12","form_id":"ca7b33e0-eca9-4e2a-8574-4b22471fd4e2"}}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_315276296882282E11","form_id":"ca7b33e0-eca9-4e2a-8574-4b22471fd4e2"}}]}]}]}}