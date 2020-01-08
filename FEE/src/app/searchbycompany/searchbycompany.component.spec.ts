import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchbycompanyComponent } from './searchbycompany.component';

describe('SearchbycompanyComponent', () => {
  let component: SearchbycompanyComponent;
  let fixture: ComponentFixture<SearchbycompanyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchbycompanyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchbycompanyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
