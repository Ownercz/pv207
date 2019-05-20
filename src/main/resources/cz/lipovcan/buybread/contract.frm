{"id":"0af6a2d6-ebbb-4b2b-b460-5500f5f2a96a","name":"contract","model":{"source":"INTERNAL","className":"cz.lipovcan.buybread.supplier_contract","name":"supplier_contract","properties":[{"name":"supplier_amount","typeInfo":{"type":"BASE","className":"java.lang.Integer","multiple":false},"metaData":{"entries":[]}},{"name":"supplier_name","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}},{"name":"products","typeInfo":{"type":"OBJECT","className":"cz.lipovcan.buybread.Product","multiple":true},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.data.modeller.model.DataObjectFormModel"},"fields":[{"placeHolder":"Supplier_amount","maxLength":10,"id":"field_2704","name":"supplier_amount","label":"Supplier_amount","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"supplier_amount","standaloneClassName":"java.lang.Integer","code":"IntegerBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.integerBox.definition.IntegerBoxFieldDefinition"},{"maxLength":100,"placeHolder":"Supplier_name","id":"field_8145","name":"supplier_name","label":"Supplier_name","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"supplier_name","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"creationForm":"0d39a891-4096-4900-a694-4569adca752e","editionForm":"0d39a891-4096-4900-a694-4569adca752e","columnMetas":[{"label":"Product_name","property":"product_name"},{"label":"Product_prize","property":"product_price"},{"label":"Product_amount","property":"product_amount"}],"container":"FIELD_SET","id":"field_4081","name":"products","label":"Products","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"products","standaloneClassName":"cz.lipovcan.buybread.Product","code":"MultipleSubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.multipleSubform.definition.MultipleSubFormFieldDefinition"}],"layoutTemplate":{"version":2,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"6","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_8145","form_id":"0af6a2d6-ebbb-4b2b-b460-5500f5f2a96a"}}]},{"span":"6","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_2704","form_id":"0af6a2d6-ebbb-4b2b-b460-5500f5f2a96a"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_4081","form_id":"0af6a2d6-ebbb-4b2b-b460-5500f5f2a96a"}}]}]}]}}