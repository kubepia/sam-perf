# Performance testing

> This is testing repository comparing application stack/architectures
> It will cover nodejs and springboot using static resource and api including simple business logic

## Environment

- OCP4.5
- Ngrinder 3.4

## static test

### scenario

> Use jpg file to response with one or multiple files


|   No  |   Stack        |   Virtual User    |   Duration(min)   |
|:-----:|:--------------:|------------------:|------------------:|
|   1   |   nginx        |   100             |   5               |
|   2   |   nodejs       |   100             |   5               |
|   3   |   springboot   |   100             |   5               |

### Step

1. choose resource : 0.5 cpu, 500mb
2. Start with springboot
3. Make baseline with TPS




---
line break\
next paragraph