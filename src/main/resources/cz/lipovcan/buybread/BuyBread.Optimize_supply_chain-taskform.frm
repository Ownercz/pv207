{"id":"5c42e462-c7f8-4988-9a3b-010762f8d9e3","name":"BuyBread.Optimize_supply_chain-taskform","model":{"processName":"Optimize_supply_chain","processId":"BuyBread.Optimize_supply_chain","name":"process","properties":[{"name":"supplier_contract","typeInfo":{"type":"OBJECT","className":"cz.lipovcan.buybread.supplier_contract","multiple":false},"metaData":{"entries":[]}},{"name":"wr_db","typeInfo":{"type":"OBJECT","className":"cz.lipovcan.buybread.Warehouse_Database","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"nestedForm":"db2cfbe3-dabd-4ed0-9341-d8dc28975345","container":"FIELD_SET","id":"field_7993","name":"supplier_contract","label":"Supplier_contract","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"supplier_contract","standaloneClassName":"cz.lipovcan.buybread.supplier_contract","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"}],"layoutTemplate":{"version":2,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_7993","form_id":"5c42e462-c7f8-4988-9a3b-010762f8d9e3"}}]}]}]}}