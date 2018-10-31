import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { StoreInvoiceModule as AccountancyInvoiceModule } from './accountancy/invoice/invoice.module';
import { StoreShipmentModule as AccountancyShipmentModule } from './accountancy/shipment/shipment.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    // prettier-ignore
    imports: [
        AccountancyInvoiceModule,
        AccountancyShipmentModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class StoreEntityModule {}
