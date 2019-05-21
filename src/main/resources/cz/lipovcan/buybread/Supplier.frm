{"id":"c43f35c2-80da-45e5-979e-078649fd8ecf","name":"Supplier","model":{"source":"INTERNAL","className":"cz.lipovcan.buybread.Supplier","name":"Supplier","properties":[{"name":"supplier_stats","typeInfo":{"type":"BASE","className":"java.lang.Integer","multiple":false},"metaData":{"entries":[]}},{"name":"supplier_actual_amount","typeInfo":{"type":"BASE","className":"java.lang.Integer","multiple":false},"metaData":{"entries":[]}},{"name":"supplier_name","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.data.modeller.model.DataObjectFormModel"},"fields":[{"maxLength":100,"placeHolder":"Supplier_name","id":"field_39352","name":"supplier_name","label":"Supplier_name","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"supplier_name","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"placeHolder":"Supplier_stats","maxLength":1,"id":"field_7662","name":"supplier_stats","label":"Supplier_stats","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"0 - less, 1- same, 2 - more amount of goods needed for future contract","binding":"supplier_stats","standaloneClassName":"java.lang.Integer","code":"IntegerBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.integerBox.definition.IntegerBoxFieldDefinition"},{"placeHolder":"Supplier_actual_amount","maxLength":100,"id":"field_1409","name":"supplier_actual_amount","label":"Supplier_actual_amount","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"supplier_actual_amount","standaloneClassName":"java.lang.Integer","code":"IntegerBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.integerBox.definition.IntegerBoxFieldDefinition"}],"layoutTemplate":{"version":2,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_39352","form_id":"c43f35c2-80da-45e5-979e-078649fd8ecf"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_7662","form_id":"c43f35c2-80da-45e5-979e-078649fd8ecf"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_1409","form_id":"c43f35c2-80da-45e5-979e-078649fd8ecf"}}]}]}]}}