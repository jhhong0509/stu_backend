# 챕터6 다양한 연관관계 매핑

### 연관관계 소개

##### 연관관계에서 조심할 것

- 다중성

  어떤 관계를 갖는지에 대해 고민해야 한다.

  > 다대일, 일대일과 같은 관계를 정의한다.

- 단방향, 양방향

  단방향으로 매핑할지, 양방향으로 매핑할 지에 대해 고민해야 한다.

- 연관관계의 주인

  연관관계의 master와 slave를 명확하게 생각해 두어야 한다.

  > 외래 키를 어느 테이블에서 가지고 있는지 고민해야 한다.

##### 다중성

연관관계에는 일대다/다대일만 있는게 아니다.

- 다대일(`@ManyToOne`)
- 일대다(`@OneToMany`)
- 일대일(`@OneToOne`)
- 다대다(`@ManyToMany`)

> 판단이 어려울 때엔 반대에서 생각하면 된다.
>
> 반대 테이블에서 자기 자신의 컬럼을 